package com.example.Motiiiii.controllers; // Change package name as per your project

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResponseController {

    @GetMapping("/option1")
    public String option1Page(Model model) {
        model.addAttribute("message", "I'm really sorry if I ever hurt you. Can we please fix this? 💖");
        return "response"; // This will map to response.html
    }

    @GetMapping("/option2")
    public String option2Page(Model model) {
        model.addAttribute("message", "I think we need to have a heart-to-heart talk. 💬");
        return "response";
    }

    @GetMapping("/option3")
    public String option3Page(Model model) {
        model.addAttribute("message", "I understand. Take your time, I'll be here. ⏳");
        return "response";
    }

    @GetMapping("/option4")
    public String option4Page(Model model) {
        model.addAttribute("message", "No matter what, I will always cherish our friendship. 😊");
        return "response";
    }
}
