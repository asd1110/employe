package com.wipro.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import com.wipro.employee.entity.Employee;
import com.wipro.employee.util.ExceptionUtil;

public class DaoEmployee {
	
	Connection con = ExceptionUtil.getConnection();
	public ArrayList<Employee> findALL()
	{
		try
		{
			Statement st = new Statement();
		}
		return null;
	}
	
	public Employee findById(int deptno);
	{
		try
		{
			PreparedStatement ps = con.PreparedStatement();
			if()
		}
	}
	
	

}
