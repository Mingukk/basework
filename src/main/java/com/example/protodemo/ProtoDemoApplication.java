package com.example.protodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAsync
@SpringBootApplication
public class ProtoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtoDemoApplication.class, args);
	}


	@GetMapping("hello")
	public String testDemo(){
		return "hello String!";
	}
}
