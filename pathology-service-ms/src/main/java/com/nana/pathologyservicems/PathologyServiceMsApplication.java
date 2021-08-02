package com.nana.pathologyservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class PathologyServiceMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PathologyServiceMsApplication.class, args);
    }

}
