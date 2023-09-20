package com.cydeo.repository;

import com.cydeo.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class OracleDataBase {

    private static List<Employee> employeeList=new ArrayList<>();

    public static void safeEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees(){
        return employeeList;
    }

}
