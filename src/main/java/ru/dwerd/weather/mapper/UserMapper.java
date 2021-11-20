package ru.dwerd.weather.mapper;


import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.dwerd.weather.model.User;

import java.time.LocalDateTime;

@Component
public class UserMapper {
    public User toUser(Message message) {
        try {
            return User.builder()
                .chatId(message.getChatId())
                .firstName(message.getFrom().getFirstName())
                .lastName(message.getFrom().getLastName())
                .localDateTime(LocalDateTime.now())
                .userId(message.getFrom().getId())
                .username(message.getFrom().getUserName())
                .location(User.Location.builder()
                    .lat(message.getLocation().getLatitude())
                    .lon(message.getLocation().getLongitude())
                    .build())
                .build();
        } catch (NullPointerException e) {
            return User.builder()
                .chatId(message.getChatId())
                .firstName(message.getFrom().getFirstName())
                .lastName(message.getFrom().getLastName())
                .localDateTime(LocalDateTime.now())
                .userId(message.getFrom().getId())
                .username(message.getFrom().getUserName())
                .location(User.Location.builder()
                    .lat(null)
                    .lon(null)
                    .build())
                .build();
        }
    }
}
