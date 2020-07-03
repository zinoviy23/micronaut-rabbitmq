package example.micronaut.books;

import io.micronaut.rabbitmq.annotation.RabbitClient;

@RabbitClient(AnalyticsClient.TOPIC) // <1>
public interface AnalyticsClient extends AnalyticsClientBase {
    //TODO: exchange reference
    String TOPIC = "analytics";
}
