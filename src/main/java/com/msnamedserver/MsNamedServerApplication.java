package com.msnamedserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsNamedServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNamedServerApplication.class, args);
	}

}
