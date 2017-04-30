package com.lastminutedevrequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient1Application.class, args);
	}
}
