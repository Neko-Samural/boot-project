package com.shangma.cn.controller;

import com.shangma.cn.entity.Employee;
import com.shangma.cn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("logger")
    public String logger(){
        logger.trace("trace打印了");
        logger.debug("debug打印了");
        logger.info("info打印了");
        return "OK";
    }


    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
