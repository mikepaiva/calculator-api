package com.calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@RequestMapping(value = "/sum", method = RequestMethod.GET)
	public double sum(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
		return a + b;
	}
	
	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public double sub(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
		return a - b;
	}
	
	@RequestMapping(value = "/mult", method = RequestMethod.GET)
	public double mult(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
		return a * b;
	}
	
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public double div(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
		return a / b;
	}
}
