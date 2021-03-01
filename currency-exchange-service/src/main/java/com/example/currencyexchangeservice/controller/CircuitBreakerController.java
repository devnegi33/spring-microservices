package com.example.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
	Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("sample-api")
	//@Retry(name = "sample-api", fallbackMethod = "hardCodedResponse")
	@CircuitBreaker(name = "sample-api", fallbackMethod = "hardCodedResponse")
	public String sampleApi() {
		logger.info("***Calling sampeApi***");
		new RestTemplate().getForEntity("http://localhost:8080/demo", String.class);
		return "Sample-Api";
	}

	private String hardCodedResponse(Exception e) {
		return "From Fallback-method";
	}
}
