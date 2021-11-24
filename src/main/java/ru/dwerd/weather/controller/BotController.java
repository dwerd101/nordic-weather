package ru.dwerd.weather.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.dwerd.weather.bot.WeatherTelegramBot;
import ru.dwerd.weather.feign.WeatherFeignClient;
import ru.dwerd.weather.model.User;
import ru.dwerd.weather.service.MemoryUsersService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
public class BotController {
    private final WeatherTelegramBot telegramBot;
    private final MemoryUsersService memoryUsersService;
    @PostMapping("/")
    @SneakyThrows
    public BotApiMethod<?> getWeather(@RequestBody Update update) {
     return telegramBot.onWebhookUpdateReceived(update);
    }
    //api
    @GetMapping("/find-all-users")
    public Set<User> findAllUsers() {
        return  memoryUsersService.findAllUsers();
    }
    @GetMapping("/find-all-history-users")
    public List<User> findAllHistoryUsers() {
        return  memoryUsersService.findAllHistoryUsers();
    }
    @GetMapping("/find-user-by-id/{id}")
    public User findUserById(@PathVariable Long id) {
        return memoryUsersService.findUserById(id);
    }
    @GetMapping("/find-history-user-by-id/{id}")
    public List<User> findHistoryUserById( @PathVariable Long id) {
        return  memoryUsersService.findHistoryUserById(id);
    }
}
