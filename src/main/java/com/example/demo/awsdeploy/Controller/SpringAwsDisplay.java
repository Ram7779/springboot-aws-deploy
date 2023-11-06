package com.example.demo.awsdeploy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class SpringAwsDisplay {
	
	
	@GetMapping("/data")
	public String getData() {
		
		return " Hello this is first cimmit for Aws ECS";
	}

}
