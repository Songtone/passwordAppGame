package com.example.songt.password;

/**
 * Created by songt on 2017-12-04.
 */

public class WordBank {

    private String mWord [] = {
      "CAR","PLASTIC","PHONE","TREE","PENCIL","MOUSE","CAT","DOG","ARM","HEAD","BEER","BEE","HAMMER","HOCKEY","BALL","MOUNTAIN",
            "GLASSES","MOTORCYCLE","CARDS","LAMP","SUN","CLOUD","FLAG","ERASER","APPLE","FLOWER"
    };

    public String getWord(int a){
        String word = mWord[a];
        return word;
    }
    public int wordBankLength(){
        int length = mWord.length;
        return length;
    }
}
