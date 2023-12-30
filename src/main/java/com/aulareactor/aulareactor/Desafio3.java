package com.aulareactor.aulareactor;

import reactor.core.publisher.Mono;

/*
 * Verificar se o usuário é válido, caso seja, retornar void, caso contrário disparar uma exception
 * (considerar que o usuário é valido quando ele tem uma senha com mais de 8 caractéres)
 */

public class Desafio3 {
    public Mono<Void> usuarioValido(final Users user) {
        if (user.senha().length() > 8) {
            return Mono.empty();
        } else {
            return Mono.error(new RuntimeException("Senha deve ser maior que 8 caracteres."));
        }
    }
}
