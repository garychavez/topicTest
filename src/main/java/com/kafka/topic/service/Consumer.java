package com.kafka.topic.service;

import com.kafka.topic.model.entity.Operation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
@Data
public class Consumer {


////    @KafkaListener(topics = "testTopic", groupId = "group_id", containerFactory = "listenerContainerFactory")
//    @KafkaListener(topics = "${spring.kafka.producer.topic}", groupId = "group_id")
//    public void consume(Operation operation)  throws IOException {
//        log.info(String.format("#### -> Consumed message -> %s", operation));
//    }
    @KafkaListener(topics = "${spring.kafka.producer.topic}", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }




}