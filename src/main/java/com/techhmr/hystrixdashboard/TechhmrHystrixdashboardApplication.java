package com.techhmr.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class TechhmrHystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechhmrHystrixdashboardApplication.class, args);
	}

}
