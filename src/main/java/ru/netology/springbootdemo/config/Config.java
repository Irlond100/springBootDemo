package ru.netology.springbootdemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootdemo.model.DevProfile;
import ru.netology.springbootdemo.model.ProductionProfile;
import ru.netology.springbootdemo.model.SystemProfile;

@Configuration
public class Config {

    @Bean
    public SystemProfile systemProfile() {
        if (Boolean.parseBoolean(System.getProperty("netology.profile.dev"))) {
            return new DevProfile();
        } else {
            return new ProductionProfile();
        }
    }
}
