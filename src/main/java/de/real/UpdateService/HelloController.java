package de.real.UpdateService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/Roberto")
    public String index(){
        return "Hello Roberto";
    }
}
