package com.countrymain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class MyCountryMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCountryMvcApplication.class, args);
	}

}
