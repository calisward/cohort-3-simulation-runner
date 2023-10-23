package com.HocusPocus.Simulation.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

class RuleSets {
    public int id;
    public String username;

    public RuleSets(int id, String username) {
        this.id = id;
        this.username = username;
    }
}


@RestController
public class RulesetsController {

@DeleteMapping("/RuleSet")
    public Map<String, String> deleteUser(){
    return Collections.singletonMap("result","success");
}
}
