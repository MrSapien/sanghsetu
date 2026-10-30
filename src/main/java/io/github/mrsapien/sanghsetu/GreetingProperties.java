package io.github.mrsapien.sanghsetu;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sanghsetu.greeting")
    public record GreetingProperties(String message, String environment) {}

