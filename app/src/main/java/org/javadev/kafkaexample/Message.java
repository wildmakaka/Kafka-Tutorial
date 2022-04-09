package org.javadev.kafkaexample;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {

}
