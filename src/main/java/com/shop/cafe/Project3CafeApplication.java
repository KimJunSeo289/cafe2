package com.shop.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config/secu.properties")
public class Project3CafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project3CafeApplication.class, args);
	}

}
