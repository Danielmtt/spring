package br.com.trader.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.trader.model.Trader;
import br.com.trader.service.service;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/v1/api/finance")
@RequiredArgsConstructor
public class FinanceController {
    
    	private final service svc;  
    
	@GetMapping(value = "/finalcialBytrader/{code}")
	public Trader finalcialBytrader(@PathVariable() int code) {
	    	Trader trader = svc.getTrader(code);
		return trader;
	}

	@GetMapping(value = "/createNewFile")
	public String CreateNewFile() {
		return "Create File";
	}

}