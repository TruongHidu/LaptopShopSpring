package com.nvt.LaptopShopSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopShopSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopShopSpringApplication.class, args);
	}

}
