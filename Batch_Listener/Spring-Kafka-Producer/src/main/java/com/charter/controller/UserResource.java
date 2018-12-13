package com.charter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("kafka")
public class UserResource {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "Kafka_Example";

	@GetMapping("/publish/{number}")
	public String post(@PathVariable("number") final int number) {

		 for(int i=0;i<number;i++) {
			 System.out.println("Message from the producer : Ping "+i);
		kafkaTemplate.send(TOPIC, "Ping"+i);
		 }
		return "Published successfully";
	}

}