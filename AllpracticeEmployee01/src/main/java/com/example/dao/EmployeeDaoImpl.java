package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.beans.EmployeeReq;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
//	  @Value("${query.insertEmployeeDetails}")
//	  String insertEmpQuery;
	
	
	
	@Override
	public Boolean insertEmployeeDetailsByMapSql(List<EmployeeReq> employeeReq) {
		
		String insertEmpQuery = "insert into Employee_info(emp_name,emp_salary,emp_deptName,emp_bloodGroup,emp_designation) values(:empNm,:empSal,:empDeptNm,:empBloodGp,:empDesg)";
		
		try {
		MapSqlParameterSource parameter = new MapSqlParameterSource();
	
	
	
		}
		catch(Exception e) {

			e.printStackTrace();
		}

		
		return null;
	}

	@Override
	public Boolean insertEmployeeDetailsByMap(List<EmployeeReq> employeeReq) {
		
		return null;
	}

	@Override
	public Boolean insertEmployeeDetailsByBeanProperty(List<EmployeeReq> employeeReq) {
		String insertEmpQuery2 = "insert into Employee_info(emp_name,emp_salary,emp_deptName,emp_bloodGroup,emp_designation) values(:empNm,:empSal,:empDeptNm,:empBloodGp,:empDesg)";
		
		Boolean result = namedParameterJdbcTemplate.update(insertEmpQuery2, new BeanPropertySqlParameterSource(employeeReq))>0;
				
		return result;
		
	}

	
	
}
