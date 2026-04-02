package com.chatbot.chat.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ChatAssistantService {
    @SystemMessage("You are a helpful AI assistant. Be friendly and concise.")
    String chat(@MemoryId String sessionId, @UserMessage String message);
}
