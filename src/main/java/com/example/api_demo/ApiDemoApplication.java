package com.example.api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiDemoApplication {


	public String message(){
		return "Hello this os from Local Demo!!! for Azure";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

}
