package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic cursorTopic() {
        return TopicBuilder.name("cursorTopic")
            .build();
    }

    @Bean
    public NewTopic cursorTopic2() {
        return TopicBuilder.name("cursorTopic2")
            .build();
    }
}
