package com.example.currencyexchangeservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.currencyexchangeservice.bean.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long> {
	
	public CurrencyExchange findByFromAndTo(String from, String to);

}
