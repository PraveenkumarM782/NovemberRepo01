package com.example.service;

import java.util.List;

import com.example.beans.EmployeeReq;

public interface EmployeeService {

	Boolean insertEmployeeDetailsByMapSql(List<EmployeeReq> employeeReq);

	Boolean insertEmployeeDetailsByMap(List<EmployeeReq> employeeReq);

	Boolean insertEmployeeDetailsByBeanProperty(List<EmployeeReq> employeeReq);

	
}
