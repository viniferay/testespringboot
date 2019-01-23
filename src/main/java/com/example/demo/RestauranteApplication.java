package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Prato;
import com.example.demo.repositories.PratoRepository;

@SpringBootApplication
public class RestauranteApplication implements CommandLineRunner {

	@Autowired
	private PratoRepository pratorepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Prato p1 = new Prato(null, "PCO", "Brasileira", "Pão e Ovo", 2);
		Prato p2 = new Prato(null, "Macarrão com Queijo", "Americana", "Macarrão e queijo", 2.5);
		
		pratorepository.saveAll(Arrays.asList(p1, p2));
		
	}

}

