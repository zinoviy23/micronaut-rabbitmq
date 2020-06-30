package com.example.messagingrabbitmq;

import java.util.concurrent.CountDownLatch;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	private final String myQueue = "receiver-queue";
	private CountDownLatch latch = new CountDownLatch(1);

//	@RabbitListener(queues = "spring-boot")
	@RabbitListener(queues = myQueue)
	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}
