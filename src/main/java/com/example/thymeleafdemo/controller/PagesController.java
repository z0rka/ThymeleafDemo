package com.example.thymeleafdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;



/**
 * @author z0rka 07.02.2023
 * Controller for pages
 */
@Controller
@Slf4j
public class PagesController {

    public static final String CURRENT_DATE = "currentDate";
    public static final String BASIC_WINDOW = "basicWindow";

    @GetMapping("/info")
    public String info(Model model) {
        model.addAttribute(CURRENT_DATE, LocalDate.now().toString());
        model.addAttribute("data", "System time millis:" + System.currentTimeMillis());
        return BASIC_WINDOW;
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute(CURRENT_DATE, LocalDate.now().toString());
        model.addAttribute("data", "Welcome");
        return BASIC_WINDOW;
    }
}
