package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

 // This is Application class for Spring boot
 
@SpringBootApplication
@EnableFeignClients
//@ComponentScan(basePackages = "com.cognizant.auditportal.controller" + "com.cognizant.model" + "com.cognizant.feignclients")
public class AuditWebPortalApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(AuditWebPortalApplication.class, args);
	}

}
