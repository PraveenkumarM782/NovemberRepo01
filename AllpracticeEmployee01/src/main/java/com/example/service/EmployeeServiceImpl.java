package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.EmployeeReq;
import com.example.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Boolean insertEmployeeDetailsByMapSql(List<EmployeeReq> employeeReq) {
		
		return employeeDao.insertEmployeeDetailsByMapSql(employeeReq);
	}

	@Override
	public Boolean insertEmployeeDetailsByMap(List<EmployeeReq> employeeReq) {
		
		return employeeDao.insertEmployeeDetailsByMap(employeeReq);
	}

	@Override
	public Boolean insertEmployeeDetailsByBeanProperty(List<EmployeeReq> employeeReq) {
		
		return employeeDao.insertEmployeeDetailsByBeanProperty(employeeReq);
	}

	
}
