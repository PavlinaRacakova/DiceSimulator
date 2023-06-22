package com.DS.DiceSimulator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class DiceSimulatorController {

    Random random = new Random();

    @GetMapping("/oneDice")
    public ModelAndView oneDice() {
        ModelAndView modelAndView = new ModelAndView("oneDice");
        modelAndView.addObject("number", random.nextInt(6) + 1);
        return modelAndView;
    }
//
//    @GetMapping("/twoDices")
//    public ModelAndView twoDices() {
//
//    }
}
