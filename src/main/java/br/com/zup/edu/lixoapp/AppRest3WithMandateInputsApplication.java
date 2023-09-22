package br.com.zup.edu.lixoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class) // Needed by Zalando Problem lib
public class AppRest3WithMandateInputsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRest3WithMandateInputsApplication.class, args);
	}

}
