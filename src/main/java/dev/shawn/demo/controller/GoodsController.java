package dev.shawn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/goods")
public class GoodsController {

    @GetMapping("/name")
    public String getName(){
        return "shampoo";
    }

}
