package com.betaplan.angela.springlesson.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {
    @RequestMapping("/{name}/{city}/{favDrink}")
    public String index(@PathVariable String name, @PathVariable String city, @PathVariable String favDrink, Model model) {

        ArrayList<String> locations = new ArrayList<>();
        locations.add("Tirana");
        locations.add("Durres");
        locations.add("Elbasan");


        model.addAttribute("allLocations", locations);
        model.addAttribute("favDrink",favDrink);
        model.addAttribute("name",name);
        model.addAttribute("city",city);

        return "index";
    }

}