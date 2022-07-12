package com.informatorio.springProject.controller;

import com.informatorio.springProject.entity.Employee;
import com.informatorio.springProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public @ResponseBody Iterable <Employee> findEmployees(){
        return repository.findAll();
    }
}
