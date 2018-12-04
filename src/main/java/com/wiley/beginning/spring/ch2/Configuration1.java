package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {

    @Bean
    public Foo foo() {
	
	Foo toBeReturned = new Foo();
	toBeReturned.setName("Conf1");
	
	return toBeReturned;
    }
}
