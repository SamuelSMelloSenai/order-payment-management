package com.weg.order_payment_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Representa os dados necessários para criação de usuários no sistema.
 *
 * @author samuel_silva-mello
 * @version 1.0
 * @since 2026-08-20
 * @param name
 * @param email
 * @param password
 */
public record UserCreateRequest(

        /**
         * Valida que o nome tenha entre 3 a 100 caracteres.
         * Não pode ser nulo.
         */
        @NotBlank
        @Size(min = 3, max = 100)
        String name,

        /**
         * Valida que o endereço de e-mail de cadastro seja válido.
         * Não pode ser nulo
         */
        @NotBlank
        @Email
        String email,

        /**
         * Valida que a senha de cadastro tenha no minimo 8 caracteres.
         * Não pode ser nulo.
         * Precisa ter pelo menos uma letra maiúscula.
         * Precisa ter pelo menos um número.
         * Precisa ter pelo menos um caractere especial.
         */
        @NotBlank
        @Size(min = 8)
        @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).+$")
        String password
) {
}
