package com.github.richygreat.springbootsonar.service;

import org.springframework.stereotype.Service;

@Service
public class FooService {
	public String sayFoo() {
		System.out.println("Entering sayFoo");
		return "Foo";
	}
}
