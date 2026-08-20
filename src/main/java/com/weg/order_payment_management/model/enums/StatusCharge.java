package com.weg.order_payment_management.model.enums;

/**
 * Representa o estados de ciclo de uma cobrança no sistema.
 *
 * @author samuel_silva-mello
 * @since 1.0.0
 */
public enum StatusCharge {

    /**
     * Cobrança criada pelo cobrador, aguardando aprovação do pagamento.
     */
    PENDING("Pending"),

    /**
     * Cobrança paga pelo pagante.
     */
    PAID("Paid"),

    /**
     * Cobrança expirada, pagamento atrasado.
     */
    EXPIRED("Expired"),

    /**
     * Cobrança cancelada pelo cobrante.
     */
    CANCELED("Canceled");

    /**
     * Descrição legível do status da cobrança para exibição em telas e relatórios.
     */
    private final String description;

    /**
     * Construtor interno para associar propriedades ao status
     * @param description Texto legível ao status.
     */
    StatusCharge(String description) {
        this.description = description;
    }

    /**
     * Obtém a descrição amigável do status.
     *
     * @return A descrição do status para exibição.
     */
    public String getDescription() {
        return description;
    }
}
