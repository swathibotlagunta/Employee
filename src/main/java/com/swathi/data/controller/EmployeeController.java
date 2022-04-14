package com.swathi.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.data.dto.EmployeeRequest;
import com.swathi.data.dto.EmployeeResponse;
import com.swathi.data.model.Employee;
import com.swathi.data.service.Employeeservice;

@RestController
public class EmployeeController {
	@Autowired
	Employeeservice es;

	@PostMapping("/save")
	ResponseEntity<EmployeeResponse> savePerson(@RequestBody EmployeeRequest pReq) {

		return new ResponseEntity<>(es.save(pReq), HttpStatus.OK);
	}

	@GetMapping("/get")
	ResponseEntity<List<Employee>> getEmployee() {

		return new ResponseEntity<>(es.getEmployee(), HttpStatus.OK);
	}

}
