package com.soprasteria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.soprasteria")
@EnableSwagger2
@Configuration
public class SpringBootEmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeCrudApplication.class, args);
		System.out.println("Hiiii");
	}
	
	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.soprasteria.controller"))
				.paths(PathSelectors.ant("/rest/*"))
				.build(); 
	}

}
