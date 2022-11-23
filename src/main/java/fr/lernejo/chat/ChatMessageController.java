package fr.lernejo.chat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ChatMessageController {

    final ChatMessageRepository repo;

    public ChatMessageController(ChatMessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value ="/api/message")
    List<String> SendList() throws JsonProcessingException {
        return repo.mymessage;
    }

}
