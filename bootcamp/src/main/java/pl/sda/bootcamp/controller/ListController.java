package pl.sda.bootcamp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/kurs")

public class ListController {

    @GetMapping("/lista")
    public String list() {
                return "course/list";
            }
    @GetMapping("/add")
    public String add() {
        return "course/addingCourse";
    }

}
