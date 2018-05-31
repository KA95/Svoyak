package com.mirzalizade.svoyak.bots;

import com.mirzalizade.svoyak.model.UserMessage;
import com.mirzalizade.svoyak.repository.UserMessageRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

/**
 * @author Anton Klimansky
 */
@Component
@RequiredArgsConstructor
public class HelloBot extends TelegramLongPollingBot {

    @Value("${bots.hello.name}")
    private String name;

    @Value("${bots.hello.key}")
    private String key;

    @NonNull
    private UserMessageRepository userMessageRepository;

    @Override
    public void onUpdateReceived(Update update) {
        UserMessage message = new UserMessage(update.getMessage().getText(), update.getMessage().getFrom().getUserName());
        userMessageRepository.save(message);
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return key;
    }
}
