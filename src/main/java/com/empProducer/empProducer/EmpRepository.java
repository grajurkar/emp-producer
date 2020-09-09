package com.empProducer.empProducer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

	static List<Employee> empList = new ArrayList<Employee>();

	public List<Employee> findAllEmp() {
		empList.add(new Employee("1", "Gaurav", "SSE", 1000));
		empList.add(new Employee("2", "Vaibhav", "Student", 3000));
		empList.add(new Employee("3", "Chaitali", "SAP Consultant", 10000000));

		return empList;
	}

}
