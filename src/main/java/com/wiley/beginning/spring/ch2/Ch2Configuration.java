package com.wiley.beginning.spring.ch2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Ch2Configuration {

    @Bean
    @Profile("dev")
    public Foo devFoo(@Value("${name}")String name) {
	Foo bean = new Foo();
	bean.setName(name);
	return bean;
    }
    
    @Bean
    @Profile("prod")
    public Foo prodFoo(@Value("${name}")String name) {
	Foo bean = new Foo();
	bean.setName(name);
	return bean;
    }
}
