package com.ham1142.exer2_0;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;  // 업캐스팅
		
		snowTire.run();
		tire.run();
				
		
	}

}
