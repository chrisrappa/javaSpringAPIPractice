package com.apiPractice.APIPractice;

import com.apiPractice.APIPractice.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiPracticeApplication.class, args);
	}



}
