package com.cg.eis.pl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
	Employee emp= null;
	int j =0;
	String insScheme=null;
	Scanner sc=new Scanner(System.in);
	EmpServiceImp empService=new EmpServiceImp();
	
	HashMap<Integer,String> insDetail=new HashMap<Integer,String>();
	HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
		System.out.println("Enter no. of employees: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			j = i+1;
		System.out.println("Enter the employee name: ");
		String empName=sc.next();
		
		System.out.println("Enter the employee Salary: ");
		float empSal=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the employee Designation: ");
		String empDesgn=sc.nextLine();
		
		emp= new Employee(empName, empSal, empDesgn );
		map.put(j, emp);
	
		insScheme = empService.getInsuranceScheme(emp);
		System.out.println("Your Scheme is: "+insScheme);
	
		insDetail.put(j, insScheme);
	
		}
		System.out.println("Enter your scheme: ");
		String scheme = sc.nextLine().toUpperCase();
		System.out.println(scheme);
		for(j=0;j<num;j++)
		{
		if(scheme.equals(insDetail.get(j)))
		{
			emp = map.get(j);
			System.out.println(empService.displayEmpInfo(emp,empService.getInsScheme()));
		}
		else
		{
			System.out.println("No results found");
		}
		}
		sc.close();
		}	

}
