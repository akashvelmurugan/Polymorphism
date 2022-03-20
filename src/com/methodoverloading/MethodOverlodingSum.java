package com.methodoverloading;

public class MethodOverlodingSum {
	//different datatype
	//different datatype order
	//diffrent datatype count
	
	void sum(int a,int b) {
		System.out.println("int method are invoked");
	}
	void sum(long a,long b) {
		System.out.println("long method are invoked");
	}
	public static void main(String[] args) {
		MethodOverlodingSum methodOverlodingSum= new MethodOverlodingSum();
		methodOverlodingSum.sum(10, 20);	
	}
}
