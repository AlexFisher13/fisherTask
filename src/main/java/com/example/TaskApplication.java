package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {
	@Bean
	public String str() {
		return "asdasd";
	}

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
}
