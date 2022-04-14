package com.swathi.data.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swathi.data.dto.EmployeeRequest;
import com.swathi.data.dto.EmployeeResponse;
import com.swathi.data.model.Employee;
import com.swathi.data.repository.EmployeeRepository;

@Service
public class Employeeservice {
	@Autowired
	EmployeeRepository emprepo;
	
	public List<Employee>getEmployee()
	{
		return emprepo.findAll();
	}
	
	public EmployeeResponse save(EmployeeRequest eReq)
	{
		Employee e = new Employee();
		BeanUtils.copyProperties(eReq, e);
		
		Calculate a=new Calculate();
		e.setAge(a.CalculateAge(eReq.getDob()));
		if(emprepo.save(e) != null) {
			EmployeeResponse er = new EmployeeResponse();
			BeanUtils.copyProperties(e, er);
			return er;
		}else {
			return null;
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
