package com.polymophism;

public class OperatorOverloading {
	private void string(String string,String string2) {

		System.out.println(string+string2);
	}
	private void number(int i,int j) {
		System.out.println(i+j);
	}
	public void numberEquallOrNot(int fisrtNumber,int SecondNumber) {
		System.out.println(fisrtNumber==SecondNumber);
	}
	public static void main(String[] args) {
		OperatorOverloading operatorOverloading= new OperatorOverloading();
		operatorOverloading.string("java", "program");
		operatorOverloading.number(10, 20);
		operatorOverloading.numberEquallOrNot(12, 12);
	}
}
