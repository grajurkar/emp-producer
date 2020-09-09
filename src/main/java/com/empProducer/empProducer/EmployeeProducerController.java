package com.empProducer.empProducer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeProducerController {

	@Autowired
	EmpRepository empRepository;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> createEmployees() {

		return empRepository.findAllEmp();

	}

}
