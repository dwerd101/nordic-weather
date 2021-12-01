# Weather-bot
<p align="center"><img src="https://cdn-icons.flaticon.com/png/512/2862/premium/2862807.png?token=exp=1638377311~hmac=176c9e8852135d426b53c5da19c3380e" 
 alt="Weather"  height="300"  />
 
## Описание
Данный бот реализован на платформе <img src="https://cdn-icons.flaticon.com/png/512/644/premium/644609.png?token=exp=1638378826~hmac=7ea05e602325d1bd2d86cd4ae1951106" 
 alt="Spring"  height="30"/> + <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1280px-Spring_Framework_Logo_2018.svg.png" 
 alt="Spring"  height="25"/>. С помощью данного бота, вы можете узнать погоду в своем городе.
## Разработка
- Язык разработки: **Java 8**
- Фреймворк: **Spring Boot 2.5.5, Spring Cloud OpenFeign**
- Библиотеки: **Lombok, Mapstruct**
- Внешнее API: [Yandex Weather API](http://http://https://yandex.ru/dev/weather/doc/dg/concepts/about.html), [Telegram API](https://github.com/rubenlagus/TelegramBots/tree/master/telegrambots-spring-boot-starter)
- Сборка: **Gradle**
## API
- Найти всех пользователей, кто пользуется нашим ботом и отправлял геолокацию
	- GET http://localhost:8080/find-all-users
- Найти историю всех пользователей, кто пользуется нашим ботом и отправлял геолокацию
	- GET  http://localhost:8080/find-all-users 
- Найти пользователя по id
	- GET  http://localhost:8080/find-user-by-id/{id}
- Найти пользователя и историю его всех отправленных геопозиций.
	- GET  http://localhost:8080/find-history-user-by-id/{id}
## Как запустить
1. Установить webhook в браузере, где url -  http://localhost:8080/ , а mytoken - токен вашего бота. Пример : https://api.telegram.org/bot(mytoken)/setWebhook?url=https://mywebpagetorespondtobot/mymethod
2. Написать команду в консоли, находясь внутри вашего проекта :
```console
    ./gradlew bootrun
```
