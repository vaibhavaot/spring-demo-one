package com.vaibhav.springdemo;



public class BaseballCoach implements Coach  
{
	//define a private field for the dependency 
	private FortuneService fortuneService;
	
	// defeine a constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 min in practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}
