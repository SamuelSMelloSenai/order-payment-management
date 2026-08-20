package com.weg.order_payment_management.model;

import com.weg.order_payment_management.model.enums.StatusCharge;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa uma cobrança criado por um usuário.
 * Mapeia a tabela 'charges' no banco de dados relacional
 *
 * @author samuel_silva-mello
 * @version 1.0
 * @since 2026-08-20
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "charges")
@Getter
@Setter
public class Charge {

    /**
     * Identificador único da cobrança (Chave primária).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Relancionando de muitos para um com a tabela 'users'.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /**
     * Aplica o status da cobrança com a classe Enum 'StatusCharge'.
     */
    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusCharge status;

    /**
     * Valor da cobrança para exibição.
     */
    @NotNull
    @Positive
    private BigDecimal value;

    /**
     * Identificador único da transação no gateway.
     */
    @NotBlank
    private String externalTxId;

    /**
     * QRCode para exibição
     */
    @Column(length = 500)
    @NotBlank
    private String pixQrCode;

    /**
     * Data e hora que a cobrança foi criada.
     */
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    /**
     * Data e hora da última atualização do status ou dados da cobrança.
     */
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

}
