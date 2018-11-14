package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * com.luv2code.springdemo Created by MałyKriszo on 2018-11-14.
 */
@Component("thatSillyCoach")
public class TennisCoach  implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your tennis";
    }
}
