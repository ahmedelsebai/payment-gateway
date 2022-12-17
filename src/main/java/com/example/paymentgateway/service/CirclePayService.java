package com.example.paymentgateway.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.paymentgateway.entity.GWProviderEnum;


@Component
public class CirclePayService {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	public GWService getGWService(String provider) {
		
		
		switch (provider) {
		case "1":
			return applicationContext.getBean(GWOneService.class);
		case "2":
			return applicationContext.getBean(GWTwoService.class);
		case "3":
			return applicationContext.getBean(GWThreeService.class);
			
		default:
			throw new UnsupportedOperationException("Unsupported Provider");
		
		}
	}
	
	@SuppressWarnings("rawtypes")
	public Stream getProviders(){
		
		return Arrays.stream(GWProviderEnum.values());
	}

}
