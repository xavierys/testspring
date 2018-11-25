package com.wiley.beginning.spring.ch2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wiley.beginning.spring.ch2.AccountDao;
import com.wiley.beginning.spring.ch2.AccountDaoInMemoryImpl;
import com.wiley.beginning.spring.ch2.AccountService;

@Configuration
public class Ch2BeanConfiguration {
    
    @Bean
    public AccountService accountService() {
	AccountServiceImpl bean = new AccountServiceImpl();
	bean.setAccountDao(accountDao());
	return bean;
	
    }

    @Bean
    public AccountDao accountDao() {
	AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
	return bean;
    }
}
