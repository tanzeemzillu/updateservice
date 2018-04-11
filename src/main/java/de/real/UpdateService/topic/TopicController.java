package de.real.UpdateService.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/Topics")
    public String getAllTopics(){
        return"All Topics";
    }
}