package com.imran.week1intro.introToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class Apple {

    void eatApple() {
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple bean before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying the Apple bean");
    }
}
