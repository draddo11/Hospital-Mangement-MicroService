package com.nana.pathologyservicems.Resources;


import com.nana.pathologyservicems.Models.Disease;
import com.nana.pathologyservicems.Models.DiseasesList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/pathology")
public class PathologyResource {
    List<Disease> diseases = Arrays.asList(
            new Disease("D1" ,"Asthma" , "One inhaler" ),
            new Disease("D2" ,"Malaria" , "One inhaler" ),
            new Disease("D3" ,"Headache" , "Paracetamol" ),
            new Disease("D4" ,"Back Pain " , "Ointment" )
    );

    @RequestMapping("/diseases")
    public DiseasesList getDiseases(){

        DiseasesList diseaseslist= new DiseasesList();
        diseaseslist.setDiseases(diseases);
        return  diseaseslist;
    }

    @RequestMapping("/diseases/{Id}")
    public Disease getDiseaseById(@PathVariable("Id") String Id){
        Disease d = diseases.stream()
                .filter( disease -> Id.equals(disease.getId()))
                .findAny().orElse(null);
                return d;
    }
}
