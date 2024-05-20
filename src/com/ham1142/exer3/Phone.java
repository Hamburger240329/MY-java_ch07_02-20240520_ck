package com.ham1142.exer3;

public abstract class Phone {
	
	public String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
//	public void turnOn() {
//		System.out.println("폰 전원을 컵니다.");
//	}
	
	
//	public void turnOff() {
//		System.out.println("폰 전원을 끕니다.");
//	}
	
	public abstract void turnOn(); // 추상메소드
	
	public abstract void turnOff();
	
}
