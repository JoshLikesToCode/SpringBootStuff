package com.joshlikestocode.springdemo;

public class CodingCoach implements Coach{

	private FortuneService fortuneService;
	
	public CodingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public CodingCoach() {}

	@Override
	public String getDailyWorkOut()
	{
		return "Do another Leetcode medium.";
	}
	
	@Override
	public String getDailyFortune()
	{
		return "Hmm, I see a Leetcode hard in your future: " + fortuneService.getFortune();
	}
}
