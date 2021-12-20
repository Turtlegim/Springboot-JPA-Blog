package com.turtle.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// spring이 com.turtle.blog 패키지 이하의 모든 파일을 스캔해서
// 특정 어노테이션이 붙은 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해준다.
@RestController
public class TurtleblogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello spring boot</h1>";
    }
}
