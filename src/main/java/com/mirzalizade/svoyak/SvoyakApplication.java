package com.mirzalizade.svoyak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class SvoyakApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(SvoyakApplication.class, args);
	}
}
