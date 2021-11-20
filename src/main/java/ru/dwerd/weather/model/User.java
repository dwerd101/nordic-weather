package ru.dwerd.weather.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Long userId;
    String firstName;
    String lastName;
    String username;
    Long chatId;
    LocalDateTime localDateTime; //Неоьязательное поле для статистики
    Location location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }

    @FieldDefaults(level = AccessLevel.PRIVATE)
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Location {
        Double lat;
        Double lon;
    }
}
