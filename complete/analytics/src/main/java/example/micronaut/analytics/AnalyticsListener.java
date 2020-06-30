package example.micronaut.analytics;

import io.micronaut.configuration.rabbitmq.annotation.Queue;
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;

@Requires(notEnv = Environment.TEST) // <1>
@RabbitListener // <2>
public class AnalyticsListener {

    private final AnalyticsService analyticsService; // <3>

    public AnalyticsListener(AnalyticsService analyticsService) { // <3>
        this.analyticsService = analyticsService;
    }

    // TODO queue completion
    @Queue("") // <4>
    public void updateAnalytics(Book book) {
        analyticsService.updateBookAnalytics(book); // <5>
    }

    // TODO gutter
    @Queue("reviews") // <4>
    public void updateReviews(Book book) {
        analyticsService.updateBookAnalytics(book); // <5>
    }
}
