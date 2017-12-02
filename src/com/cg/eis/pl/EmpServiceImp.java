package com.cg.eis.pl;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.bean.Employee;

import java.util.Scanner;

public class EmpServiceImp implements EmployeeService {
	private String insScheme;
	public String getInsScheme() {
		return insScheme;
	}

	public void setInsScheme(String insScheme) {
		this.insScheme = insScheme;
	}

	@Override
	public String getInsuranceScheme(Employee emp) {
		
		double empSal=emp.getEmpSalary();
		String empDesgn=emp.getEmpDesign().toUpperCase();
		
		if(empSal>5000 && empSal<20000 && empDesgn.equals("SYSTEM ASSOCIATE"))
		{
			insScheme="Scheme C";
		}
		else if(empSal>=20000 && empSal<40000 && empDesgn.matches("PROGRAMMER"))
		{
			insScheme="Scheme B";
		}
		else if(empSal>=40000 && empDesgn.matches("MANAGER"))
		{
			insScheme="Scheme A";
		}
		else if(empSal<5000 && empDesgn.matches("CLERK"))
		{
			insScheme="No Scheme";
		}
		else
		{
			System.out.println("Scheme Not Matched");
		}
		return insScheme;
	}

	@Override
	public String displayEmpInfo(Employee emp, String insScheme) {
		return  "\nEmployee Name: " + emp.getEmpName()
				+ "\nEmployee Salary: " + emp.getEmpSalary() + "\nEmployee Designation=" + emp.getEmpDesign()
				+"\nInsurance Scheme: "+insScheme+ "";
	}
}
