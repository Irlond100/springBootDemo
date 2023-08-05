package ru.netology.springbootdemo.model.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootdemo.model.DevProfile;
import ru.netology.springbootdemo.model.ProductionProfile;
import ru.netology.springbootdemo.model.SystemProfile;

@Configuration
public class Config {

    @ConditionalOnProperty("netology.profile.dev")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty("netology.profile.dev")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
