package com.h2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class H2DemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}
}

