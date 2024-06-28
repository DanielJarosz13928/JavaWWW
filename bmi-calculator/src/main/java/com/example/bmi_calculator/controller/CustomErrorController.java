package com.example.bmi_calculator.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        // Obsługa niestandardowej strony błędu
        model.addAttribute("errorMessage", "Wystąpił nieoczekiwany błąd.");
        return "error"; // Przyjmij, że masz szablon Thymeleaf o nazwie "error.html"
    }
}
