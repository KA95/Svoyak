package com.mirzalizade.svoyak.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Anton Klimansky
 */
@Entity
@Getter
@Setter
public class UserMessage extends AbstractEntity {

    String text;

    String username;

    public UserMessage(String text, String username) {
        this.text = text;
        this.username = username;
    }

}
