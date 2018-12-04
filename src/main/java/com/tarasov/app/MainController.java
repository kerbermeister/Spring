package com.tarasov.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "TEST!!!");
        return "index";
    }
}
