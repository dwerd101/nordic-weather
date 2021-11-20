package ru.dwerd.weather.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@RequiredArgsConstructor
@Data
public class MemoryUsers {
    private final List<User> historyUsers;
    private final Set<User> users;

    public void addHistoryUsers(User user) {
        historyUsers.add(user);
    }
    public void addUsers(User user) {
        users.add(user);
    }
}
