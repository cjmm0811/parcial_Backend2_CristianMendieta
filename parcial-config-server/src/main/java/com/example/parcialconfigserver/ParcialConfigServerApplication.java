package com.example.parcialconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ParcialConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialConfigServerApplication.class, args);
	}

}
