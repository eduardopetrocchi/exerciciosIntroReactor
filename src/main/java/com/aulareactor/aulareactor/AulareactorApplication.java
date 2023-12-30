package com.aulareactor.aulareactor;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class AulareactorApplication {

	public static void main(String[] args) {
		 Desafio1 desafio1 = new Desafio1();
			List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
			Flux<Integer> resultado = desafio1.inc(numbers);
			resultado.subscribe(System.out::println);
////////////////////////////////////////////////////////		

		Desafio2 desafio2 = new Desafio2();
		    List<Users> usersList = Arrays.asList(
		        new Users(1L, "User1", "user1@example.com", "password1", true),
		        new Users(2L, "User2", "user2@example.com", "password2", false),
		        new Users(3L, "User3", "user3@example.com", "password3", true)
		   		);
		desafio2.countAdms(usersList)
		    .subscribe(count -> System.out.println("Número de administradores: " + count));
//////////////////////////////////////////////////////////

		Desafio3 desafio3 = new Desafio3();
        Users usuarioValido = new Users(1L, "senhaValida", "NomeUsuario", "usuario@example.com", false);
        Users usuarioInvalido = new Users(2L, "senha", "OutroUsuario", "outro.usuario@example.com", true);

        desafio3.usuarioValido(usuarioValido)
            .doOnSuccess(success -> System.out.println("Usuário válido."))
            .subscribe();

        desafio3.usuarioValido(usuarioInvalido)
            .doOnSuccess(success -> System.out.println("Usuário válido."))
            .doOnError(error -> System.out.println("Erro: " + error.getMessage()))
            .subscribe();
    }
}


