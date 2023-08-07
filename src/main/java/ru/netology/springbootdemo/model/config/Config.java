package ru.netology.springbootdemo.model.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootdemo.model.DevProfile;
import ru.netology.springbootdemo.model.ProductionProfile;
import ru.netology.springbootdemo.model.SystemProfile;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.prod", havingValue = "true")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
