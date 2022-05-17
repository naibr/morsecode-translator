package com.nology;

public class Main {

    public static void main(String[] args) {

        MorseCode morseCode = new MorseCode();

        morseCode.convertToMorseCode("nology");
        morseCode.convertToEnglish("-. --- .-.. --- --. -.-- ");

    }
}