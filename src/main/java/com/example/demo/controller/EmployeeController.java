package com.example.demo.controller;

import java.util.List;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @GetMapping(value = "/hello")
    public String hello() {

        return "hello!!";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {

        return empService.getAllEmployees();

    }

    @RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
    public void insertEmployee(@RequestBody Employee employee) {
        empService.insertEmployee(employee);
    }

}