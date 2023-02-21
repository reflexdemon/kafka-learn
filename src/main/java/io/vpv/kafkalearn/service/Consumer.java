package io.vpv.kafkalearn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private KafkaTemplate<String, String> kafkaTemplate;

    public Consumer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(
            topics = "VPV_TEST_Topic",
            groupId = "VPV_MESSAGE"
    )
    public void listenToTopic(String receivedMessage) {
        System.out.println("The Message received is " + receivedMessage);
    }
}
