package com.kafka.topic.service;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaConsumerRoute extends RouteBuilder {

    String kafkaConsumerURI = "kafka:camel-demo?brokers=localhost:9092";
    @Override
    public void configure() throws Exception {

        //route set 3
        from(kafkaConsumerURI + "&groupId=group_id&autoOffsetReset=earliest&seekTo=BEGINNING")
                .log("message - ${body} from ${headers[kafka.TOPIC]}");

    }
}