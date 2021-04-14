package com.shangma.cn.mapper;

import com.shangma.cn.entity.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper {


    @Select("select * from employee")
    public List<Employee> findAll();

}
