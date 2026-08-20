package com.weg.order_payment_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa um usuário cadastrado no sistema.
 * Mapeia a tabela 'users' no banco de dados.
 *
 * @author samuel_silva-mello
 * @version 1.0
 * @since 2026-01-01
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Getter
@Setter
public class User {

    /**
     * Identificador único do usuário (Chave Primária).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome completo do usuário.
     * Não pode ser nulo.
     */
    @Column(nullable = false)
    @NotBlank
    private String name;

    /**
     * Endereço de e-mail do usuário utilizado para login e notificações.
     * Deve ser único no sistema.
     * Não pode ser nulo.
     */
    @Column(unique = true, nullable = false)
    @Email
    @NotBlank
    private String email;

    /**
     * Senha de cadastro do usuário.
     * Não pode ser nulo.
     */
    @Column(nullable = false)
    @NotBlank
    private String password;

}
