package com.imran.week1intro.introToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConifg {

    @Bean
    @Scope("prototype")
    Apple getApple(){
        return new Apple();
    }
}
