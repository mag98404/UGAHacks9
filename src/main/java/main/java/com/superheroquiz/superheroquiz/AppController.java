package main.java.com.superheroquiz.superheroquiz;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
@GetMapping("/")
    public String index() {
        return "index";
    }
}


    

