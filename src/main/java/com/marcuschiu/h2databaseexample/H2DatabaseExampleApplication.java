package com.marcuschiu.h2databaseexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class H2DatabaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseExampleApplication.class, args);
	}

}
