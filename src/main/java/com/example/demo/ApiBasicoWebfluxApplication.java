package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository"})
public class ApiBasicoWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBasicoWebfluxApplication.class, args);
	}

}
