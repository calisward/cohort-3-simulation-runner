package com.HocusPocus.Simulation.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
@GetMapping("/RuleSet")
    public List<RuleSets> getRuleset() {
    List<RuleSets> list = new ArrayList<RuleSets>();
    list.add(new RuleSets(001, "First"));
    list.add(new RuleSets(002, "Second"));
    list.add(new RuleSets(003, "Third"));
    return list;

}

@DeleteMapping("/RuleSet")
    public Map<String, String> deleteUser(){
    return Collections.singletonMap("result","success");
}
}
