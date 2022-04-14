package com.swathi.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "employee_name")
	private String name;
	@Column(name = "employee_salary")
	private int salary;
	@Column(name = "employee_city")
	private String city;
	@Column(name = "employee_dob")
	private String dob;
	@Column(name = "employee_age")
	private int age;
}
