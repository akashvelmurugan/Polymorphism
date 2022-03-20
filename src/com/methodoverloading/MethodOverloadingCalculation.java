package com.methodoverloading;

public class MethodOverloadingCalculation{
	void sum(int a,long b) {
		System.out.println("int args method invoked");
	}
	void sum(long a,int b) {
		System.out.println("long args method invoked");
	}
	public static void main(String[] args) {
		MethodOverloadingCalculation c= new MethodOverloadingCalculation();
		//	c.sum(10, 10); compile time error datatype order same

	}
}
