package com.vaibhav.springdemo;

public class CricketCoach implements Coach {

	//add new fields
	private String emailAddress;
	private String team;
	
	//get and set email address from source and generate getter and setter
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method:setemail address");
		this.emailAddress = emailAddress;
	}

	//get and set team from source and generate getter and setter
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method:setTeam");
		this.team = team;
	}

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method:setfortune service");
		this.fortuneService = fortuneService;
	}

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
