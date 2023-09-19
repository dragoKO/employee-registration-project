package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/create")
   public String createEmployee(){




       return "employee/employee-create";
   }


}
