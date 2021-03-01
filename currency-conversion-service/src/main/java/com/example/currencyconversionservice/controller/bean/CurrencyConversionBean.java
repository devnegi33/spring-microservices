package com.example.currencyconversionservice.controller.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private long id;
	private String from;
	private String to;
	private BigDecimal amount;
	private BigDecimal conversionMultiple;
	
	private BigDecimal calculatedAmount;
	private String environment;

	CurrencyConversionBean() {
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	/**
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the calculatedAmount
	 */
	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	/**
	 * @param calculatedAmount the calculatedAmount to set
	 */
	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param conversionMultiple
	 * @param amount
	 * @param calculatedAmount
	 * @param environment
	 */
	public CurrencyConversionBean(long id, String from, String to,BigDecimal amount,
			BigDecimal conversionMultiple, 
			BigDecimal calculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.amount = amount;
		this.calculatedAmount = calculatedAmount;
		this.environment = environment;
	}

}
