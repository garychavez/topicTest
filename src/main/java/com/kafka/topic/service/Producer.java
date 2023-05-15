package com.kafka.topic.service;

import com.kafka.topic.model.entity.Operation;
//import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@Component
public class Producer {
    @Value("${spring.kafka.producer.topic}")
    private String TOPIC0;

    @Autowired
    @Qualifier("kafkaJsonTemplate")
    private KafkaTemplate<String, Operation> kafkaTemplate;

    public void sendMessage(Operation operation) {
        log.info(String.format("#### -> Producing message -> %s", operation));
        this.kafkaTemplate.send(TOPIC0, operation);
    }
}