package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmpServiceImp;

public interface EmployeeService {
	public String getInsuranceScheme(Employee emp);
	public String displayEmpInfo(Employee emp, String insScheme);
	
}
