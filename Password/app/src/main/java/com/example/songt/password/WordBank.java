package com.example.songt.password;

/**
 * Created by songt on 2017-12-04.
 */

public class WordBank {

    private String mWord [] = {
            "CAR","PLASTIC","PHONE","TREE","PENCIL","MOUSE","CAT","DOG","ARM","HEAD","BEER","BEE","HAMMER","HOCKEY","BALL","MOUNTAIN",
            "GLASSES","MOTORCYCLE","CARDS","LAMP","SUN","CLOUD","FLAG","ERASER","APPLE","FLOWER","PICTURE","JACKET","BANANA","MOON",
            "SPACE","STAR","WHIP","ORANGE","CACTUS","MONEY","RIBBON","BONE","HORSE","SKATE","CARROT","BROCCOLI","POTATO","KISS","DOLL",
            "DINOSAUR","FOREST","BIRD","GIANT","DRESS","ZOO","SALTY","HAMBURGER","HOT DOG","PICKLE","TEQUILA","MOSQUITO","YOGA","PURPLE",
            "CRUISE","POOL","NERD","PLANE","SAUSAGE","EGG","CLOCK","KNIGHT","CHURCH","SCREWDRIVER","THONG","BRA","SHOE","POT","VODKA","MOUSE",
            "MOOSE","COW","MILK","JUICE","SALSA","TACO","TOMATO","SOCCER","TICKLE","SANTA","GIGGLE","FEATHER","SPOON","GRUMPY","HAPPY","SAD",
            "MISTLETOE","COOKIE","GIFT","WRAP","FISH","BOAT","BOOK","BUSH","WINE","BOOTY","BLUSH","LIPSTICK","BEARD","DOLPHIN","SMILE","TOOTH",
            "CANDLE","LIGHT","MISSILE","CAMERA","PANTS","SOCKS","ICE","DRAGON","WALL","TAPE","SCISSORS","LADDER","STAPLER","SHY","HUNGRY","STRAWBERRY",
            "ERASER","SUBMARINE","LUCKY","IRON","GOLD","SMART","TOMBSTONE","SMOKE","EXPLOSION","RICH","POOR","STUDENT","WATER","UMBRELLA","FAIRY","TAIL"
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
