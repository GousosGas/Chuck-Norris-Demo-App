package com.example.jokes.demo.controllers;


import com.example.jokes.demo.jokes.Jokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private Jokes jokeService;

    @Autowired
    public JokeController(Jokes jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJokes());
        return "chucknorris";
    }


}
