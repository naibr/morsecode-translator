package com.nology;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    private MorseCode morseCode;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        morseCode = new MorseCode();
    }


    @org.junit.jupiter.api.Test
    public void shouldConvertWordToMorseCode() {

        String englishWord = "WAR";
        String convertedWord = morseCode.convertToMorseCode(englishWord);

        assertEquals(".-- .- .-. ", convertedWord);
    }

    @org.junit.jupiter.api.Test
    public void ShouldConvertCodeToEnglish() {

        String englishWord = "";
        String code = ".-- .- .-.";
        englishWord = morseCode.convertToEnglish(code);

        assertEquals(englishWord, "WAR");
    }

}