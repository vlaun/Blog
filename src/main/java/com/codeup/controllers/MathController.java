package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
//

@Controller
public class MathController {
    @ResponseBody
    @GetMapping("/add/{one}/and/{two}")
    public int add(@PathVariable int one, @PathVariable int two) {
        return one + two;

    }
    @ResponseBody
    @GetMapping("/subtract/{one}/from/{two}")
    public int subtract(@PathVariable int one, @PathVariable int two) {
        return one - two;

    }
    @ResponseBody
    @GetMapping("/multiply/{one}/and/{two}")
    public int multiply(@PathVariable int one, @PathVariable int two) {
        return one * two;

    }
    @ResponseBody
    @GetMapping("/divide/{one}/by/{two}")
    public double divide(@PathVariable double one, @PathVariable double two) {
        return one / two;

    }
    @ResponseBody
    @GetMapping("/modulus/{one}/by/{two}")
    public int modulus(@PathVariable int one, @PathVariable int two) {
        return one % two;

    }

}

