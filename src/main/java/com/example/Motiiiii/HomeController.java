package com.example.Motiiiii;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Your Friend's Name"); // Change this
        return "index"; // This should match "index.html"
    }

    @GetMapping("homeOption1")
    public String option1(Model model) {
        model.addAttribute("message", "I really want to fix things between us. Let's talk and make it better ❤️.");
        return "response"; // This should match "response.html"
    }

    @GetMapping("/homeOption2")
    public String option2(Model model) {
        model.addAttribute("message", "We need to talk. I don't want to lose what we had 🥺.");
        return "response";
    }

    @GetMapping("/homeOption3")
    public String option3(Model model) {
        model.addAttribute("message", "I respect your space. Take your time, but please don't forget me 💙.");
        return "response";
    }

    @GetMapping("/homeOption4")
    public String option4(Model model) {
        model.addAttribute("message", "If staying friends is the best for you, I will accept it. But just know you’ll always be special to me 💔.");
        return "response";
    }
}
