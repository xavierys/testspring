package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {

    @Bean
    public Foo foo() {
	
	Foo toBeReturned = new Foo();
	toBeReturned.setName("Conf2");
	
	return toBeReturned;
    }
}
