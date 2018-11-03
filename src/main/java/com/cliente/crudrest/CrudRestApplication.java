package com.cliente.crudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CrudRestApplication {
	

	@RequestMapping("/")
	@ResponseBody
	String paginaInicial() {
		return "Olá, Crud!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudRestApplication.class, args);
	}
}
