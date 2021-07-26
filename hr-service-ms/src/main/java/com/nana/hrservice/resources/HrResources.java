package com.nana.hrservice.resources;


import com.nana.hrservice.Models.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/hr")
public class HrResources {
    List<Employee> employees = Arrays.asList(
                new Employee("E1" ,"Pam" , "Pine" ,"Med Tech"),
                new Employee("E2" , "Chris","Rock" ,"Pharma"),
                new Employee("E3" , "James","Flint" ,"Surgery"),
                new Employee("E4" , "Ben" ,"Mark","Dentistry")
    );


    @RequestMapping("/employees")
//    public List<Employee> getEmployees()
//    old format was changed to make request from other servoces

    public EmployeesList getEmployees(){
        EmployeesList employeesList = new EmployeesList();
        employeesList.setEmployees(employees);
        return employeesList;
    }

    @RequestMapping("/employees/{Id}")
    public Employee getEmployeeById(@PathVariable("Id") String Id){
       Employee e = employees.stream()
               .filter(employee -> Id.equals(employee.getId()))
               .findAny().orElse(null);
       return e;
    }
}
