package com.ancile.crud;

public class Employee {
	private String empName;
	private String empAddress;
	public Employee() {
		
	}
	public Employee(String empName, String empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	public String  GetName() {
		return "Hi this is GetName() from Employee class";
	}
	
	

}
