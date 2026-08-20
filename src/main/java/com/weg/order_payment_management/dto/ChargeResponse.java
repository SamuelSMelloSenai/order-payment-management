package com.weg.order_payment_management.dto;

import com.weg.order_payment_management.model.enums.StatusCharge;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa os dados que serão retornados para o front.
 *
 * @param value
 * @param user
 * @param statusCharge
 * @param pixQRCode
 * @param createdAt
 */
public record ChargeResponse(
        BigDecimal value,
        UserResponse user,
        StatusCharge statusCharge,
        String pixQRCode,
        LocalDateTime createdAt
) {
}
