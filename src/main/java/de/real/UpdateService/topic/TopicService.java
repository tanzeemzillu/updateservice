package de.real.UpdateService.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics= new ArrayList<>(Arrays.asList(
                new Topic("book_1", "book name", "book description"),
                new Topic("book_2", "book name", "book description"),
                new Topic("book_3", "book name", "book description"),
                new Topic("book_4", "book name", "book description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
