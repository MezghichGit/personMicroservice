package com.sip.ams;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient

@RestController
@RequestMapping("/persons")
public class PersonServiceApplication {

	@Value("${me}")
	private String me;
	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}
	
	@RequestMapping("info")
	public String getPerson()
	{
		return "I m a student";
	}
	
	@RequestMapping("details")
	public String getPersonDetails()
	{
		return "I m a student in Spring " + me;
	}

}
