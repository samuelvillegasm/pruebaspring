package com.miprimerproyecto.pruebaspring.helpers;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MorseHelper {

    private static Map<String, Character> dictionary = new HashMap<>();
    private static Map<Character, String> dictionary2 = new HashMap<>();
    static {
        dictionary.put(".-", 'A');
        dictionary.put("-...", 'B');
        dictionary.put("-.-.", 'C');
        dictionary.put("-..", 'D');
        dictionary.put(".", 'E');
        dictionary.put("..-.", 'F');
        dictionary.put("--.", 'G');
        dictionary.put("....", 'H');
        dictionary.put("..", 'I');
        dictionary.put(".---", 'J');
        dictionary.put("-.-", 'K');
        dictionary.put(".-..", 'L');
        dictionary.put("--", 'M');
        dictionary.put("-.", 'N');
        dictionary.put("---", 'O');
        dictionary.put(".--.", 'P');
        dictionary.put("--.-", 'Q');
        dictionary.put(".-.", 'R');
        dictionary.put("...", 'S');
        dictionary.put("-", 'T');
        dictionary.put("..-", 'U');
        dictionary.put("...-", 'V');
        dictionary.put(".--", 'W');
        dictionary.put("-..-", 'X');
        dictionary.put("-.--.", 'Y');
        dictionary.put("--..", 'Z');
        dictionary.put("-----", '0');
        dictionary.put(".----", '1');
        dictionary.put("..---", '2');
        dictionary.put("...--", '3');
        dictionary.put("....-", '4');
        dictionary.put(".....", '5');
        dictionary.put("-....", '6');
        dictionary.put("--...", '7');
        dictionary.put("---..", '8');
        dictionary.put("----.", '9');
        for (String clave: dictionary.keySet()) {
            dictionary2.put(dictionary.get(clave), clave);
        }
    }

    public static String translateMorseCode(String morseCode) {
        String[] words = morseCode.split("   ");
        StringBuilder spanishSentence = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                spanishSentence.append(dictionary.get(letter));
            }
            spanishSentence.append(" ");
        }
        return spanishSentence.toString();
    }

    public static String translateSpanishSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder morseCode = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split("");
            for (String letter : letters) {
                morseCode.append(dictionary2.get(letter.charAt(0)));
                morseCode.append(" ");
            }
            morseCode.append("   ");
        }
        return morseCode.toString();
    }
}
