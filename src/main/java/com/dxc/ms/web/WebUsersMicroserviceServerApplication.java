package com.dxc.ms.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class WebUsersMicroserviceServerApplication {

	public static final String USERS_SERVICE_URL = "http://USERS-MICROSERVICE";
	public static void main(String[] args) {
		SpringApplication.run(WebUsersMicroserviceServerApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public UserRepository userRepository(){
		return new RemoteUserRepository(USERS_SERVICE_URL);
	}
	
	
	
	
}
