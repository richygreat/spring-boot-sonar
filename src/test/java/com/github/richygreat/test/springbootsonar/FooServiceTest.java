package com.github.richygreat.test.springbootsonar;

import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.richygreat.springbootsonar.service.FooService;
import com.github.richygreat.test.springbootsonar.config.SuccessConfig;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = SuccessConfig.class, initializers = ConfigFileApplicationContextInitializer.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FooServiceTest {
	@Autowired
	private FooService fooService;

	@Test
	public void testFooService() {
		assertNotNull(fooService.sayFoo());
	}
}
