package com.ham1142.exercise;

public class SoundableExample {

	private static void prinSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		prinSound(new Cat()); // 야옹
		prinSound(new Dog()); // 멍멍

	}

}
