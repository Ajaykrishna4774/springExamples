package com;

abstract class show {
	
}

public class autoMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aeroplane a = new aeroplane(101, "ajayaeroPlane");
		System.out.println(a.fly(10));
		System.out.println(a);
		train t = new train(102, "ajaytrains");
		System.out.println(t.run(100));
		System.out.println(t);
		ship s = new ship(102, "ajayship");
		System.out.println(s.swimspeed(75));
		System.out.println(s);

	}

}
