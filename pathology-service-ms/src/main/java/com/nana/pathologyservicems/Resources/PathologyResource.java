package com.nana.pathologyservicems.Resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pathology")
public class PathologyResource {
    List <Disease> disease = Arrays.asList(
            new Disease("D1" ,"Asthma" , "One inhaler" ),
            new Disease("D2" ,"Malaria" , "One inhaler" ),
            new Disease("D3" ,"Headache" , "Paracetamol" ),
            new Disease("D4" ,"Back Pain " , "Ointment" ),
    )
}
