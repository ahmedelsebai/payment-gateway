package com.example.paymentgateway.service;

import org.springframework.stereotype.Service;

@Service
public class GWOneService implements GWService{

	@Override
	public String executePayment() {
		return "Execute paymeny by GW1";
	}



}
