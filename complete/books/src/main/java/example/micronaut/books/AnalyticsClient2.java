package example.micronaut.books;

import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient(AnalyticsClient2.TOPIC) // <1>
public interface AnalyticsClient2 extends AnalyticsClientBase {
    //TODO: exchange reference
    String TOPIC = "analytics";
}
