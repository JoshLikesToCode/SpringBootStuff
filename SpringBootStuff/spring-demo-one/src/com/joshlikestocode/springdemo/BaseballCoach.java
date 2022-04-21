package com.joshlikestocode.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	
	public BaseballCoach() {}
	
	@Override
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes in batting practice.";
	}
	
	@Override
	public String getDailyFortune()
	{
		// use my fortuneService to get a fortune
		return fortuneService.getFortune(); // making use of dependency
	}
}
