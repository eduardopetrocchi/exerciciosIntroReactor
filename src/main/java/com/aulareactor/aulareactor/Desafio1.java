package com.aulareactor.aulareactor;

import java.util.List;

import reactor.core.publisher.Flux;

/*
 * Recebe uma lista de longs, incrementa 1 nos valores e reotrna um flux dos mesmos
 */

public class Desafio1 {

    public Flux<Integer> inc(final List<Integer> numbers) {
        return Flux.fromIterable(numbers)
                .map(n -> n + 1);
    }
}