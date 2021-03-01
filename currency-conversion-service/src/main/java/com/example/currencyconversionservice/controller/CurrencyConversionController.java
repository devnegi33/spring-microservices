package com.example.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.currencyconversionservice.controller.bean.CurrencyConversionBean;
import com.example.currencyconversionservice.proxy.CurrencyExchangeProxy;

@RestController
@RequestMapping("currency-conversion")
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	/*
	 * @GetMapping("/from/{from}/to/{to}/amount/{amount}") public
	 * CurrencyConversionBean getCurrencyConversion(@PathVariable String
	 * from, @PathVariable String to,
	 * 
	 * @PathVariable BigDecimal amount) {
	 * 
	 * Map<String, String> uriVariables= new HashMap<>(); uriVariables.put("from",
	 * from); uriVariables.put("to", to); ResponseEntity<CurrencyConversionBean>
	 * responseEntity = new RestTemplate().getForEntity(
	 * "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
	 * CurrencyConversionBean.class, uriVariables); CurrencyConversionBean
	 * currencyConversionBean = responseEntity.getBody();
	 * 
	 * return new CurrencyConversionBean(currencyConversionBean.getId(), from, to,
	 * amount, currencyConversionBean.getConversionMultiple(),
	 * amount.multiply(currencyConversionBean.getConversionMultiple()),
	 * currencyConversionBean.getEnvironment());
	 * 
	 * }
	 */
	
	@GetMapping("/from/{from}/to/{to}/amount/{amount}")
	public CurrencyConversionBean getCurrencyConversionByFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal amount) {

		Map<String, String> uriVariables= new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		CurrencyConversionBean currencyConversionBean = currencyExchangeProxy.currencyExchange(from, to);
		
		return new CurrencyConversionBean(currencyConversionBean.getId(), from, to, amount, 
				currencyConversionBean.getConversionMultiple(), 
				amount.multiply(currencyConversionBean.getConversionMultiple()), 
				currencyConversionBean.getEnvironment());

	}

}
