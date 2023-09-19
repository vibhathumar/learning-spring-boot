package com.learnspringboot.learnspringboot.controller;

import com.learnspringboot.learnspringboot.configuration.CurrencyServiceConfiguration;
import com.learnspringboot.learnspringboot.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourse(){
        return configuration;
    }
}
