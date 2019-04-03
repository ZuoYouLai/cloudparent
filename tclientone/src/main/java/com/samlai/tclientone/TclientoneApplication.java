package com.samlai.tclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TclientoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TclientoneApplication.class, args);
	}

}
