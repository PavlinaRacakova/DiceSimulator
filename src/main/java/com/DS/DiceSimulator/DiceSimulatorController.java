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
        int number = random.nextInt(6) + 1;
        ModelAndView modelAndView = new ModelAndView("oneDice");
        modelAndView.addObject("number", number);
        return modelAndView;
    }

    @GetMapping("/twoDices")
    public ModelAndView twoDices() {
        int numberFirstDice = random.nextInt(6) + 1;
        int numberSecondDice = random.nextInt(6) + 1;
        ModelAndView modelAndView = new ModelAndView("twoDices");
        modelAndView.addObject("dice1", numberFirstDice);
        modelAndView.addObject("dice2", numberSecondDice);
        return modelAndView;
    }
}
