package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class maincontroller {
	private szamologep Szamologepservice = new szamologep();
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "Hello";
	}
	
	
	@GetMapping(path="/szamologep")
	@ResponseBody
	public double szamologep(
		@RequestParam("a") int a,
		@RequestParam("b") int b,
		@RequestParam("operator") String operator
		) {
			return Szamologepservice.szamol(a, b, operator);
		
		
	}
	
	
	@GetMapping(path="/calculator", consumes= "application/json", produces = "application/json")
	@ResponseBody
	public double szamolRest(@RequestBody CalculatorDto calculatorDto){
		
			return Szamologepservice.szamol(
					calculatorDto.getA(),
					calculatorDto.getB(),
					calculatorDto.getOperator());
		
	}

}

/* 
 Content-Type: application/json
{
	"a": 4,
	"b": 7,
	"operator": "+"
}
 */

