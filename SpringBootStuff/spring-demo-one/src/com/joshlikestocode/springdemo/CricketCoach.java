package com.joshlikestocode.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam()");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	// create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg ctor");
	}
	
	// create setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 min.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
