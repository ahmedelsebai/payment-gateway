package com.example.paymentgateway.service;

import org.springframework.stereotype.Service;

@Service
public class GWThreeService implements GWService{

	@Override
	public String executePayment() {
		return "Execute payment by GW3";
	}

}
