package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Limits;
import com.example.configuration.LimitConfiguration;

@RestController
public class LimitController {

	@Autowired
	private LimitConfiguration limitConfig;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(limitConfig.getMinimum(),limitConfig.getMaximum()); 
	}
}
