package com.ham1142.exer4;

public interface Car { // 인터페이스 선언
	// 인터페이스 내의 모든 메소드는 추상메소드로 사용됨 -> 인터페이스 내에서는 추상메소드만 선언 가능함
	
	String modelName = "galaxy"; // 상수만 선언 가능 - final 같은 글꼴임 - 상수 : 못 바꾸는 값들
	
	public void frontDrive(); // 일반 메서드로 선언해도 추상 메소드로 적용됨
	public void rearDrive(); // 일반 메서드로 선언해도 추상 메소드로 적용됨
	public void stopDrive(); // 일반 메서드로 선언해도 추상 메소드로 적용됨
	public void horn(); // 일반 메서드로 선언해도 추상 메소드로 적용됨
	
}
