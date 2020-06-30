package example.micronaut.books;

import io.micronaut.configuration.rabbitmq.annotation.RabbitClient;

@RabbitClient(AnalyticsClient.TOPIC) // <1>
public interface AnalyticsClient extends AnalyticsClientBase {
    //TODO: exchange reference
    String TOPIC = "analytics";
}
