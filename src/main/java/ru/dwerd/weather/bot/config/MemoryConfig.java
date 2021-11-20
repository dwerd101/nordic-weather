package ru.dwerd.weather.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.dwerd.weather.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class MemoryConfig {
    @Bean
    public List<User> listUsers() {
        return new ArrayList<>();
    }
    @Bean
    public Set<User> usersSet() {
        return new LinkedHashSet<>();
    }
}
