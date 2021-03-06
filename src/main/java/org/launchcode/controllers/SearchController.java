package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController extends TechJobsController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);
        return "search";
    }

    // TODO #1 - Create handler to process search request and display results

    @RequestMapping(value = "results")
    public String searchJobs(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {

        // ArrayList<HashMap<String, String>> jobs = new ArrayList<HashMap<String, String>>();
        // ArrayList<HashMap<String, String>> jobs;
        Iterable<HashMap<String, String>> jobs;

        String column = searchType;
        String row = searchTerm;

            if (searchType.equals("all")) {
                jobs = JobData.findByValue(row);
            } else {
                jobs = JobData.findByColumnAndValue(column, row);
            }

        model.addAttribute("columns", ListController.columnChoices);
        model.addAttribute("jobs", jobs);
        model.addAttribute("searchType", searchType); // added to be able to make radio button choice persist - bonus mission
        return "search";
    }

}
