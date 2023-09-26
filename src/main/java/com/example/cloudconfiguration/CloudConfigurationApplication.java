package com.example.cloudconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigurationApplication.class, args);
	}

}
