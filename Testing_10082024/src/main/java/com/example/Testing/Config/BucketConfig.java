package com.example.Testing.Config;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.BucketConfiguration;
import io.github.bucket4j.Refill;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static java.time.Duration.ofMinutes;

@Configuration
@RequiredArgsConstructor


public class BucketConfig {

    @Bean
    public Bucket createBucket() {

        return Bucket.builder().addLimit(limit -> limit.capacity(3).refillGreedy(1, ofMinutes(1))).build();
    }
}
