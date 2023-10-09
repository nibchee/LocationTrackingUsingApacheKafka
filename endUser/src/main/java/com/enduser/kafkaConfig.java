package com.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConfig {

    @KafkaListener(topics=AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void UpdatedLocation(String val){
        System.out.println(val);
    }
}
