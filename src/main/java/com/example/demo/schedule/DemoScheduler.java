package com.example.demo.schedule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoScheduler {

    @Value("${myprofile.name}")
    private String profileName;

    @Scheduled(fixedDelay = 1000)
    public void demoTask(){
        System.out.println("run demo task on " + profileName);
    }

}
