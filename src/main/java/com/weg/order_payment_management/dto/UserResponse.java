package com.weg.order_payment_management.dto;

/**
 * Representa os dados que seram retornados para o front.
 *
 * @param id
 * @param name
 * @param email
 */
public record UserResponse(
        Long id,
        String name,
        String email
) {
}
