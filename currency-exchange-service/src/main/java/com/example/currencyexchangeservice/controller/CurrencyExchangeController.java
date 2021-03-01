package com.example.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyexchangeservice.bean.CurrencyExchange;
import com.example.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeService exchangeService;
	@Autowired
	private Environment env;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange currencyExchange(@PathVariable String from , @PathVariable String to) {
		 CurrencyExchange exchangeValue = exchangeService.exchangeValue(from, to);
		 exchangeValue.setEnvironment(env.getProperty("local.server.port"));
		 return exchangeValue;
	}

	
}
