package ru.samsung.itschool.mdev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @PostMapping("/result")
    public @ResponseBody
    String result(@RequestParam(value = "firstname", defaultValue = "Empty") String firstname,
                  @RequestParam(value = "lastname", defaultValue = "Empty") String lastname ) {
        firstname = firstname.substring(0, 1);
        return lastname + " " + firstname + ".";
    }
}
