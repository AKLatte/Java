package com.example.kadaicommit;

public class Clock {

	public static void main(String[] args) {
		int seconds = getSeconds(18,32, 47);
		System.out.println(seconds);
	}

	public static int getSeconds(int hour, int minute, int second) {
		return hour * 3600 + minute * 60 + 60;
	}

}
