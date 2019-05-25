package com.sunbin.test.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TestSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringCloudConfigServerApplication.class, args);
	}

}
