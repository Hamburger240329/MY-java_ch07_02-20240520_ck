package com.ham1142.exer2;

public class Company {
	String name; // 필드
	int age; // 필드
	
	Human human1 = new Human(); // 필드
	Human human2 = new Human(); // 필드
	Human human3 = new Human(); // 필드
	Human human4; // 초기화가 안된 필드 선언
		
	public void work(Human human) { // 매개변수가 클래스로 선언된 객체
		human.namePrint();
		
		
	}
	
}
