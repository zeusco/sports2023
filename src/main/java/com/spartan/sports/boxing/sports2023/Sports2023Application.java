package com.spartan.sports.boxing.sports2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Sports2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Sports2023Application.class, args);
	}

}
