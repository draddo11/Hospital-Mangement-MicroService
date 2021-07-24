package com.nana.admissionsservicems.resources;


import com.nana.admissionsservicems.models.Patient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {

    List<Patient> patients= Arrays.asList(
            new Patient("P1" ,"Chris" ,"American"),
            new Patient("P2" , "Mel" , "English"),
            new Patient("P3" , "Greg" , "Spanish")
    );


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