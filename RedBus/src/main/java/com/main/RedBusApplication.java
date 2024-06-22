package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
public class RedBusApplication {

	public static void main(String[] args) {
		
		System.out.println("This is RedBus Application");
		SpringApplication.run(RedBusApplication.class, args);
	}
	
	@Bean
	public RestTemplate rt() {
		
		
		
		return new RestTemplate();
	}

}
