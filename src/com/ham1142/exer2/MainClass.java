package com.ham1142.exer2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.name = "홍길동";
		
		company.human1 = new Student(); // 업캐스팅
		company.human2 = new Worker(); // 업캐스팅
		company.human3 = new Soldier(); // 업캐스팅
			
		Human human = new Worker(); // 업캐스팅
						
		
		company.work(human);
		
		
	}

}