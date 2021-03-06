package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * com.luv2code.springdemo Created by MałyKriszo on 2018-11-14.
 */
@Component
public class TennisCoach  implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
