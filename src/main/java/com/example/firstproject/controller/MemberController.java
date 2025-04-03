package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {
    @Autowired
    MemberRepository memeberRepository;

    @GetMapping("/signup")
    public String SignUpPage(){
        return "/members/new";
    }

    @PostMapping("/join")
    public String Join(MemberForm memberForm){
        log.info(memberForm.toString());

        Member member=memberForm.toEntity();
        log.info(member.toString());

        Member saved=memeberRepository.save(member);
        log.info(saved.toString());
        return "";
    }
}
