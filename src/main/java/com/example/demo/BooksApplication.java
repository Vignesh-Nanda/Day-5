package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.demo.Entity"})
public class BooksApplication {
	
	private static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
		BooksApplication.applicationContext = SpringApplication.run(BooksApplication.class, args);
	}

}
