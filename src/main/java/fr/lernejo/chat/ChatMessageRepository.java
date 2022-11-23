package fr.lernejo.chat;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatMessageRepository {
    final List<String> mymessage;

    public ChatMessageRepository(List<String> mymessage) {
        this.mymessage = mymessage;
    }

    void addChatMessage(String message){
        mymessage.add(message);
        if (mymessage.size() > 10 )
        {
            mymessage.remove(0);
        }
    }

    List<String> getLastTenMessages(){
        return mymessage;

    }
}
