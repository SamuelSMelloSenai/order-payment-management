package com.weg.order_payment_management.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

/**
 * Representa a cobranca criada por um usuário.
 *
 * @param value
 * @param userId
 */
public record ChargeCreateRequest(
        /**
         * Valida para que o valor seja positivo.
         * Não pode ser nulo.
         */
        @NotNull
        @Positive
        BigDecimal value,

        /**
         * Valida que o id passado seja um número positivo.
         * Não pode ser nulo.
         *
         */
        @NotNull
        @Positive
        Long userId
) {
}
