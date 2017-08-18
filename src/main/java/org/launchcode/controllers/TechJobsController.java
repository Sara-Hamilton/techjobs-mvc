package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static HashMap getActionChoices() {

        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        return actionChoices;
    }
}
