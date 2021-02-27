package com.training.covidtracker.controller;

import com.training.covidtracker.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrackerController {

    @Autowired
    private TrackerService trackerService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats", trackerService.getAllStats());
        return "home";
    }
}
