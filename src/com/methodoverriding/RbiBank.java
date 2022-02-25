package com.methodoverriding;

public class RbiBank extends SbiBank{
	@Override
	public void fixed() {
		System.out.println("fixed   7%");
	}
	@Override
	public void savings() {
		System.out.println("savings 8%");
	}
	@Override
	public void credit() {
		System.out.println("cretied 8%");

	}
	public static void main(String[] args) {
		RbiBank bank= new RbiBank();
		bank.fixed();
		bank.savings();
		bank.credit();

	}
}
