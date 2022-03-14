package com.joshlikestocode.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();
		Coach theCodeCoach = new CodingCoach();
		
		// use the object
		System.out.println(theCodeCoach.getDailyWorkOut());
	}

}
