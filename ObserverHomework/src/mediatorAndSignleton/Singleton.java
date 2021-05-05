package mediatorAndSignleton;

import java.util.List;

public class Singleton {

    private static Singleton Singletonbot;

    private Singleton(){

    }

    public static Singleton getBot(){

        if(Singletonbot == null)
            Singletonbot = new Singleton();

        System.out.println("Bot is initializer");
        return Singletonbot;
    }

    public static boolean checkForForbiddenWords(List<String> words){
        if(Singletonbot == null)
            return false;

        for (String word : words) {
            if(word.equals("dog"))
                return true;
        }

        return false;
    }

}
