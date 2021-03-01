package com.example.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.currencyexchangeservice.bean.CurrencyExchange;

@Service
public class CurrencyExchangeService {
	@Autowired
	private CurrencyExchangeRepo currencyExchangeService;
	public CurrencyExchange exchangeValue(String from , String to) {
		return currencyExchangeService.findByFromAndTo(from, to);
		//return new CurrencyExchange(123L, from, to, BigDecimal.valueOf(74));
	}

}
