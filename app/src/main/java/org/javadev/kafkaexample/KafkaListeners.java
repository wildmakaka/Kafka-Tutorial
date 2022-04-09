package org.javadev.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "amigoscode", groupId = "groupId", containerGroup = "messageFactory")
    void listener(Message data) {
        System.out.println("Listener received: " + data + " ");
    }

} // The End of Class;
