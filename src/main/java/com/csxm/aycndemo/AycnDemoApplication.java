package com.csxm.aycndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
@ServletComponentScan
@SpringBootApplication
public class AycnDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AycnDemoApplication.class, args);
    }

}
