package com.kafka.topic.model.entity;

import lombok.Data;

@Data
public class Operation {
    private Integer operationId;
    private String type;
    @Override
    public String toString() {
        return "Operation{" +
                "operationId='" + operationId + '\'' +","+
                "type='" + type + '\'' +
                '}';
    }
}
