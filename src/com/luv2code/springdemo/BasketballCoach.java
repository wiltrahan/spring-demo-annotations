package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		return "Take one thousand jump shots today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmailandTeam() {
		// TODO Auto-generated method stub
		return "Your email is: " + email + ", and your team is: " + team;
	}

}
