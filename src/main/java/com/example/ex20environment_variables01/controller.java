package com.example.ex20environment_variables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("properties")
public class controller {

    @Autowired
    private PropertiesService propertiesService;

    @GetMapping
    public Collection<String> getProperties() {

        return propertiesService.getProperties();
    }
}
