package com.example.paymentgateway.controller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentgateway.service.CirclePayService;

@RestController
@RequestMapping("/checkout")
public class GWController {
	
	@Autowired
	public CirclePayService circlePayService;
	
	@PostMapping("/pay/{provider}")
	public String executePayment(@PathVariable("provider") String provider) {
		return circlePayService.getGWService(provider).executePayment();
		
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/")
	public Stream getProviders() {
		return circlePayService.getProviders();
	}

}
