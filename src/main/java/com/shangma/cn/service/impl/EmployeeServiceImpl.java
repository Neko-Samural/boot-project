package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Employee;
import com.shangma.cn.mapper.EmployeeMapper;
import com.shangma.cn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
