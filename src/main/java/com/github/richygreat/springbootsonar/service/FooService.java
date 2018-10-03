package com.github.richygreat.springbootsonar.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FooService {
	public String sayFoo() {
		log.info("Entering sayFoo");
		return "Foo";
	}
}
