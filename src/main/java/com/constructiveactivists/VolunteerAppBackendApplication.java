package com.constructiveactivists;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class VolunteerAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolunteerAppBackendApplication.class, args);
	}
}
