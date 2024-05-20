package com.ham1142.exer3;

public abstract class Car { // 추상클래스
	String model;
	String color;
	int carAge;
	
	public abstract void drive();  // 추상 메소드 -> 내용이 없는 메소드 -> 선언부만 존재
//		System.out.println("운전");
		

	public void horn() { // 경적
		System.out.println("빵빵");
	}
}

// Car 클래스 는 추상 메서드랑 일반 메서드랑 섞여 있음

