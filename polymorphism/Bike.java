package com.polymorphism;

// Method overriding

class Vehicle{
	void run() {                                     // overriding method
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {                                     // overridden method
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		Bike obj=new Bike();
		
		obj.run();
	}

}
//overridden method have more or equal accessibility than overriding method otherwise it  
// will give compile time error