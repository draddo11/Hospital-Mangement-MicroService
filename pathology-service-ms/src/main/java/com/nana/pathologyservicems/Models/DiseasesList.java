package com.nana.pathologyservicems.Models;

import java.util.List;


public class DiseasesList {

    private List<Disease> diseases;

    public List <Disease> getDiseases(){
         return  diseases;
     }
     public void getDisease(List <Disease> diseases){
         this.diseases = diseases;
     }
     public void setDiseases(List<Disease> diseases){
         this.diseases = diseases;
     }
}



//public class DiseasesList {
//    private List<Disease> disease;
//
//    public List<Disease> getDisease() {
//        return disease;
//    }
//
//    public void setDisease(List<Disease> disease) {
//        this.disease = disease;
//    }
//
//    public void setDiseases(List<Disease> diseases) {
//        this.diseases = diseases;
//    }
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//}
