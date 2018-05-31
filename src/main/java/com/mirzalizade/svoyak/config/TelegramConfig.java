package com.mirzalizade.svoyak.config;

import com.mirzalizade.svoyak.bots.HelloBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

/**
 * @author Anton Klimansky
 */
@Configuration
public class TelegramConfig {

    @Bean
    TelegramBotsApi telegramBotsApi(HelloBot helloBot) throws TelegramApiRequestException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        telegramBotsApi.registerBot(helloBot);
        return telegramBotsApi;
    }

}
