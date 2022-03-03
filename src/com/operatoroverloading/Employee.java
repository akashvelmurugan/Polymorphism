package com.operatoroverloading;

public class Employee {
	public void employeeDetails(String firstEmpName) {
		System.out.println(firstEmpName);
	}
	public void employeeDetails(String firstEmpName,String secondEmployeeName) {
		System.out.println(firstEmpName+","+secondEmployeeName);
	}
	public void employeeDetails(int firstEmpId) {
		System.out.println(firstEmpId);
	}
	public void employeeDetails(int firstEmpId,int secondEmpoleeId) {
		System.out.println("FirstEmpId"+firstEmpId+","+"SecondEmpolee"+secondEmpoleeId);
	}
	public void employeeDetails(String firstEmpName,String secondEmployeeName,int firstEmpId,int secondEmpolee) {
		System.out.println("FirstEmpId"+firstEmpId+","+"SecondEmpolee"+secondEmpolee);
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeDetails("Welcome");
		employee.employeeDetails("Welcome", "Java");
		employee.employeeDetails(12345);
		employee.employeeDetails(12345, 12346);
		employee.employeeDetails("Welcome", "Java", 12345, 12346);
	}
}
