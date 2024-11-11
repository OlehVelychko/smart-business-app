package com.example.smartbusinessapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing // Включение аудита JPA
@EnableJpaRepositories(basePackages = "com.example.smartbusinessapp.repository")
public class JpaConfig {
    // Дополнительные настройки могут быть добавлены здесь при необходимости
}