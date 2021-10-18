package com.vayox.sge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vayox.sge.repository.StudentRepository;

import java.util.Collections;

@SpringBootApplication
public class SistemaGestionEstudiantilApplication implements CommandLineRunner{

	public static void main(String[] args) {
		//SpringApplication.run(SistemaGestionEstudiantilApplication.class, args);
		SpringApplication app = new SpringApplication(SistemaGestionEstudiantilApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


	}
}
