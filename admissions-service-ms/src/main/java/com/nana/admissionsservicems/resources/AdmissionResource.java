package com.nana.admissionsservicems.resources;


import com.nana.admissionsservicems.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {

    @Autowired
    private RestTemplate restTemplate;

    List<Patient> patients= Arrays.asList(
            new Patient("P1" ,"Chris" ,"American"),
            new Patient("P2" , "Mel" , "English"),
            new Patient("P3" , "Greg" , "Spanish")
    );

    public EmployeesList getPhysicians(){
EmployeesList employeesList =
        restTemplate.getForObject("http://localhost:8082/hr/employees/", EmployeesList.Class )
        return employeesList;
    }

    @RequestMapping("/patients")
    public List<Patient> getPatients(){
        return  patients;
    }

    @RequestMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable("Id") String Id){
        Patient p= patients.stream()
                .filter(patient -> Id.equals(patient.getId()))
                .findAny().orElse(null);
                return p;
    }
}
