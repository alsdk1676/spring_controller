package com.app.controller.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {

//  localhost:10000/ex/ex01
    @GetMapping("ex01")
    public void ex01() {
        log.info("ex01 여기 실행됨!");
    };

//  ex/ex02?name=홍길동
//  사용자에게 입력 받기
//    @GetMapping("ex02")
//    public void ex02(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        log.info(name);
//    }

    @GetMapping("ex02")
    public void ex02(String name) {
        log.info(name);
    }

    // ex03을 만들고 나이를 전달받기
    // 이름과 나이 둘 다 받아서 로그 출력
    @GetMapping("ex03")
    public void ex03(String name, int age) {
        log.info(name);
        log.info(String.valueOf(age));
//        log.info("{}", age));
//        log.info("" + age);
    }

//  명확하게 그 값을 가져오고 싶을때
//  ex04
//  직업, 이름
    @GetMapping("ex04")
    public void ex04(@RequestParam("job") String job, @RequestParam("name") String name) {
        log.info(job);
        log.info(name);
    }


}
