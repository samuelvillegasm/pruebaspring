package com.miprimerproyecto.pruebaspring.helpers;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RomanHelper {
    public static int toDecimalNumber(String romanNumber) {
        Map<Character, Integer> dictionary = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        char[] charactersRomanNumber = romanNumber.toCharArray();
        int decimalNumber = 0;
        char lastCharacter = '0';
        for (char c : charactersRomanNumber) {
            if (dictionary.containsKey(c)) {
                if( lastCharacter != '0' && dictionary.get(lastCharacter) < dictionary.get(c)){
                    decimalNumber += dictionary.get(c) - (dictionary.get(lastCharacter)*2);
                }else
                    decimalNumber+= dictionary.get(c);
                lastCharacter = c;
            } else {
                return -1;
            }
        }
        return decimalNumber;
    }
}
