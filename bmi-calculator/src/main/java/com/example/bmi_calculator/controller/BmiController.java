package com.example.bmi_calculator.controller;

import com.example.bmicalculator.model.BmiForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BmiController {

    @GetMapping("/bmi")
    public String showForm(Model model) {
        model.addAttribute("bmiForm", new BmiForm());
        return "bmiCalculator";
    }

    @PostMapping("/bmi")
    public String submitForm(@ModelAttribute BmiForm bmiForm, Model model) {
        double bmi = bmiForm.calculateBmi();
        model.addAttribute("bmiResult", bmi);
        return "bmiCalculator";
    }
}
