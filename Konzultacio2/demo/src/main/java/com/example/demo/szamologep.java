package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;

public class szamologep {
	public double szamol(
			@RequestParam("a")int a,
			@RequestParam("b")int b, 
			@RequestParam("operator")String operator) {
		
		if ("+".equals(operator)) {
			return a + b;
		}
		return 0;
	}
}
