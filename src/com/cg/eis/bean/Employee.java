package com.cg.eis.bean;

public class Employee {
	private String empName;
	private float empSalary;
	private String empDesign;
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}



	public Employee() {
	}
	
	public Employee(String empName, float empSalary,String empDesign) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesign = empDesign;
	
	}

	
}
