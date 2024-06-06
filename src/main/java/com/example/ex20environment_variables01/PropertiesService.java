package com.example.ex20environment_variables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PropertiesService {

    @Autowired
    private Environment environment;

    public Collection<String> getProperties() {
        Collection<String> properties = new ArrayList<>();
        properties.add(environment.getProperty("CustomVarTree.devName"));
        properties.add(environment.getProperty("CustomVarTree.authCode"));
        return properties;
    }
}
