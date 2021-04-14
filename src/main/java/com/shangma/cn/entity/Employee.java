package com.shangma.cn.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

  private Long employeeId;
  private String employeeName;
  private String employeeImg;
  private String employeeEmail;
  private String employeeDept;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDateTime employeeTime;



}
