package pl.sda.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class HomeController {
    @GetMapping
     public String home() {
               return "home";
          }

    @PostMapping
    public String home2() {
                return "home";
            }

}
