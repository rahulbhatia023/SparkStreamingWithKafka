package com.rahul.spark;

public interface IKafkaConstants {
    String KAFKA_BROKERS = "localhost:9092";
    String TOPIC_NAME = "test"; // The topic 'test' is already created using create command
    String GROUP_ID = "testGroup";
    int MAX_POLL_RECORDS = 1;
    String OFFSET_RESET_LATEST = "latest";
    String OFFSET_RESET_EARLIER = "earliest";
}