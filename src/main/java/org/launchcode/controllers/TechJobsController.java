package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();

    @ModelAttribute("actions")
    //  will cause the return value of the method to be set in the model
    // with key "actions" for every controller that extends TechJobsController.
    public static HashMap getActionChoices() {
        return actionChoices;
    }
}
