package com.aulareactor.aulareactor;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Desafio2 {

    public Mono<Long> countAdms(final List<Users> users) {
        return Flux.fromIterable(users)
                .filter(Users::isAdm) 
                .count(); 
    }
}
