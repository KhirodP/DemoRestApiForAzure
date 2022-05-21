package com.AzureRestApi.restApiAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;




@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@SpringBootApplication
public class RestApiAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiAzureApplication.class, args);
	}

}
