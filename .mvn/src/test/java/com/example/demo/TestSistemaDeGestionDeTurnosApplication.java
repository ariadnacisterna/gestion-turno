package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestSistemaDeGestionDeTurnosApplication {

	public static void main(String[] args) {
		SpringApplication.from(SistemaDeGestionDeTurnosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
