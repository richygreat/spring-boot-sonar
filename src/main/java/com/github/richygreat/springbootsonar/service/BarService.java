package com.github.richygreat.springbootsonar.service;

import org.springframework.stereotype.Service;

@Service
public class BarService {
	public String sayBar() {
		System.out.println("Entering sayBar");
		return "Bar";
	}

	public void display() {
		System.out.println("Entering display");
	}
}
