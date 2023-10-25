package com.springannotation;

import org.springframework.beans.factory.annotation.Value;

public class CustomerDal implements ICustomerDal{
	
	@Value("${sqlConnectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("Postgre SQL Calisti");
	}
}
