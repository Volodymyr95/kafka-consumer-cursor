package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

    @KafkaListener(topics = Constants.TOPIC_NAME,
        groupId = Constants.GROUP_ID)
    public void consume(String message) {
        System.out.println("Topic 1: " + message);
    }

    @KafkaListener(topics = Constants.TOPIC_NAME2, groupId = Constants.GROUP_ID)
    public void consumeFromTopic2(String message) {
        System.out.println("Topic 2: " + message);
    }
}
