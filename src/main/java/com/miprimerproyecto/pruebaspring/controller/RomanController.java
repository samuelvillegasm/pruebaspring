package com.miprimerproyecto.pruebaspring.controller;

import com.miprimerproyecto.pruebaspring.helpers.RomanHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("roman")
public class RomanController {


    @GetMapping("/{romanNumber}")
    public int ConvertRomanNumberToDecimalNumber(@PathVariable String romanNumber) {
        return RomanHelper.toDecimalNumber(romanNumber);
    }
}
