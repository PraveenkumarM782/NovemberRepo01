package com.example.dao;

import java.util.List;

import com.example.beans.EmployeeReq;

public interface EmployeeDao {

	Boolean insertEmployeeDetailsByMapSql(List<EmployeeReq> employeeReq);

	Boolean insertEmployeeDetailsByMap(List<EmployeeReq> employeeReq);

	Boolean insertEmployeeDetailsByBeanProperty(List<EmployeeReq> employeeReq);
	
	
	
}
