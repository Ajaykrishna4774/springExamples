package com;
class Car1 {

	int carNumber;

	int run() {
		return 60;
	}
}

class FordCar extends Car1 {
	int run() {
		return super.run()+40;
		}
}
public class car
{
	public static void main(String[] ar)
	{
	FordCar f=new FordCar();
	f.run();
	}
}

