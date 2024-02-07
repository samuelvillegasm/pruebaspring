package com.miprimerproyecto.pruebaspring.controller;

import com.miprimerproyecto.pruebaspring.helpers.MorseHelper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("/to_spanish_sentence/{morseCode}")
    public String ConvertMorseCodeToSpanishSentence(@PathVariable String morseCode) {
        return MorseHelper.translateMorseCode(morseCode);
    }
    @GetMapping("/to_morse_code/{spanishSentence}")
    public String ConvertSpanishSentenceToMorseCode(@PathVariable String spanishSentence) {
        return MorseHelper.translateSpanishSentence(spanishSentence);
    }
}
