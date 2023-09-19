package com.cydeo.controller;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());


        return "employee/employee-register";
    }


}
