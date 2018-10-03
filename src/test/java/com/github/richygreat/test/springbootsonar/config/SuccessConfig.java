package com.github.richygreat.test.springbootsonar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(basePackages = "com.github.richygreat.springbootsonar", excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, classes = RestController.class) })
public class SuccessConfig {
}
