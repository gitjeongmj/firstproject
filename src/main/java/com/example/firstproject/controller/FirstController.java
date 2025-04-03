package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","홍팍");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
    @GetMapping("/random-quote")
    public String showQuote(Model model){
        String[] quotes= {
                "행복은 습관이다 ---" +
                        "-허버드-",
                "고개 숙이지 ---" +
                        "-헬렌켈러",
                "고난의 ---" +
                        "-베토벤-"
        };
        int randInt=(int)(Math.random()* quotes.length);
        model.addAttribute("randomQuote",quotes[randInt]);
        return "quote";
        }
}