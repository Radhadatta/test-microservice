package com.nsoft.association.currencyconversionservices;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="currency-exchange-service", url="localhost:8000") If we go for multiple 

//@FeignClient(name="currency-exchange-service")      // If we invoke multiple instance we don't need URL address .

@FeignClient(name="netflix-zull-gateway-server")      // Invoke the client through Zull API gateway
@RibbonClient(name="currency-exchange-service")   // Ribbon is used for Client side load balancing
public interface CurrencyConversionProxy {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}") without Zull API gateway
	
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeCurrency(@PathVariable("from") String from , @PathVariable("to") String to);
	
	
	
}
