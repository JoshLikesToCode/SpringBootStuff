package com.joshlikestocode.springdemo;

import java.util.ArrayList;
import java.util.List;



public class HappyFortuneService implements FortuneService {
	List<String> randomFortunes;
	
	HappyFortuneService()
	{
		this.randomFortunes = new ArrayList<>();
		randomFortunes.add("Today is your lucky day!");
		randomFortunes.add("Go get 'em, Tiger!");
		randomFortunes.add("Goodluck!");
	}

	
	@Override
	public String getFortune() {
		int min = 0;
		int max = 2;
		int range = max - min + 1;
		int randomNum = (int)(Math.random()*range)+min;
		return this.randomFortunes.get(randomNum);
	}

}
