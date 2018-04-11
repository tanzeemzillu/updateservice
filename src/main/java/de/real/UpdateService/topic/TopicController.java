package de.real.UpdateService.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/Topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("book 1", "book name", "book description"),
                new Topic("book 2", "book name", "book description"),
                new Topic("book 3", "book name", "book description")
        );
    }
}