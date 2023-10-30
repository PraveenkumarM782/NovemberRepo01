package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.EmployeeReq;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/insertEmployeeDetailsByMapSql")
	public Boolean insertEmployeeDetailsByMapSql(@RequestBody List<EmployeeReq> employeeReq) {
		//System.out.println("helloworld");
		
		return employeeService.insertEmployeeDetailsByMapSql(employeeReq);
	}
	
	@PostMapping("/insertEmployeeDetailsByMap")
	public Boolean insertEmployeeDetailsByMap(@RequestBody List<EmployeeReq> employeeReq) {
		return employeeService.insertEmployeeDetailsByMap(employeeReq);
	}
	
	@PostMapping("/insertEmployeeDetailsByBeanProperty")
	public Boolean insertEmployeeDetailsByBeanProperty(@RequestBody List<EmployeeReq > employeeReq) {
		return employeeService.insertEmployeeDetailsByBeanProperty(employeeReq);
	}
	
	

}
