package com.dxc.ms.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebUsersMicroserviceServerApplication {
	//public static final String USERS_SERVICE_URL = "http://USERS-MICROSERVICE";
	public static final String USERS_SERVICE_URL = "http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1";
	
	public static void main(String[] args) {
		SpringApplication.run(WebUsersMicroserviceServerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public UserRepository userRepository(){
		return new RemoteUserRepository(USERS_SERVICE_URL);
	}
	
	
	
	
}
