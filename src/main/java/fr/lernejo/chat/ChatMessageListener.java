package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    final ChatMessageRepository mystack;

    public ChatMessageListener(ChatMessageRepository mystack) {
        this.mystack = mystack;
    }

    public void onMessage(String mystring){
        mystack.addChatMessage(mystring);
        System.out.println(mystring);
    }
    /*public void onMessage(List<String> mymessage){
        StringBuilder mybuilder= new StringBuilder();
        for (String st : mymessage)
        {
            mybuilder.append(st);
        }
        String mystring = mybuilder.toString();
        //System.out.println(mystring);

    }*/
}
