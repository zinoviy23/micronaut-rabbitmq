package example.micronaut.books;

import io.micronaut.configuration.rabbitmq.annotation.Binding;

public interface AnalyticsClientBase {
    @Binding("analytics")// <2>
    void updateAnalytics(Book book); // <3>
}
