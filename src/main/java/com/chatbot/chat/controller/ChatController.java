package com.chatbot.chat.controller;

import com.chatbot.chat.model.ChatRequest;
import com.chatbot.chat.model.ChatResponse;
import com.chatbot.chat.service.ChatAssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatAssistantService chatAssistantService;

    @PostMapping()
    public ChatResponse chat(@RequestBody ChatRequest request) {

        String reply = chatAssistantService.chat(request.getSessionId(), request.getMessage());
        return new ChatResponse(reply);
    }
}
