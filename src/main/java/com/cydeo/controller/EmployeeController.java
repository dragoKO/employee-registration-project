package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import com.cydeo.repository.OracleDataBase;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.time.LocalDate;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/register")
    public String createEmployee(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());


        return "employee/employee-register";
    }

    @PostMapping("/list")
    public String employeeList(@Valid @ModelAttribute("employee") Employee employee, Model model) {
        OracleDataBase.safeEmployee(employee);
        model.addAttribute("employees", OracleDataBase.readAllEmployees());


        return "employee/employee-list";
    }

}
