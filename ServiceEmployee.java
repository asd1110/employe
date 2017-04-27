package com.wipro.employee.service;

import java.util.ArrayList;

import com.wipro.employee.dao.DaoEmployee;
import com.wipro.employee.entity.Employee;

public class ServiceEmployee {
	
	public ArrayList<Employee> getAllDepartments()
	{
		DaoEmployee 
	}
	
	public Employee getDepartment(int deptno)
	{
		if(deptno>0 && deptno <100)
		{
			DaoEmployee d = new DaoEmployee();
			return d.findById(deptno);
		}
		else
			return null;
	}

}
