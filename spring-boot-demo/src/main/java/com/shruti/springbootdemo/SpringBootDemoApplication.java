package com.shruti.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	@GetMapping("/")
	public String home(){
		return "Hello! Welcome to my website !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
