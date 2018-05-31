package com.mirzalizade.svoyak.bots;

import com.mirzalizade.svoyak.model.UserMessage;
import com.mirzalizade.svoyak.repository.UserMessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

/**
 * @author Anton Klimansky
 */
@Component
@AllArgsConstructor
public class HelloBot extends TelegramLongPollingBot {

    UserMessageRepository userMessageRepository;

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        UserMessage message = new UserMessage(update.getMessage().getText(), update.getMessage().getFrom().getUserName());
        userMessageRepository.save(message);

    }

    @Override
    public String getBotUsername() {
        return "MiSvoyak";
    }

    @Override
    public String getBotToken() {
        return "613799774:AAFUJBfLF8CjA21ut-Vt8rYbnKrGU5h31Z8";
    }
}
