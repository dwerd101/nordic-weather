package ru.dwerd.weather.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dwerd.weather.mapper.UserMapper;
import ru.dwerd.weather.model.MemoryUsers;
import ru.dwerd.weather.model.User;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemoryUsersService {
    private final MemoryUsers memoryUsers;

    public Set<User> findAllUsers() {
        return  memoryUsers.getUsers();
    }

    public List<User> findAllHistoryUsers() {
        return  memoryUsers.getHistoryUsers();
    }
    public User findUserById(Long id) {
        return  memoryUsers.getUsers().stream()
            .filter(u -> u.getUserId().equals(id))
            .findFirst()
            .orElse(new User());
    }
    public List<User> findHistoryUserById(Long id) {
        return  memoryUsers.getHistoryUsers().stream()
            .filter(u -> u.getUserId().equals(id))
            .collect(Collectors.toList());
    }


}
