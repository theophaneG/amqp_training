package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    public void onMessage(String mystring){
        System.out.println(mystring);

    }
}
