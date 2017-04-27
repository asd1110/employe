package com.wipro.employee.main;

import java.util.ArrayList;

import com.wipro.employee.entity.Employee;
import com.wipro.employee.service.ServiceEmployee;

public class EmployeeMain {
	public static void main(String[] str)
	{

	ServiceEmployee s = new ServiceEmployee();
	Employee d = s.getDepartment(20);
	System.out.println(d);
	ArrayList<Employee> list = s.getAllDepartments();
	
	for(Employee emp : list)
	{
		System.out.println(emp);
	}
	}
}
