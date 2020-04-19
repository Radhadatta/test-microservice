package com.nsoft.association.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsoft.association.limitsservice.beans.Configuration;
import com.nsoft.association.limitsservice.beans.LimitConfiguration;



@RestController
public class LimitsServiceController {
	
	@Autowired
	private Configuration configuration;

	 @GetMapping("/limits")
	public LimitConfiguration retrieveLimitfromConfiguration()
	{
		 return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
}
