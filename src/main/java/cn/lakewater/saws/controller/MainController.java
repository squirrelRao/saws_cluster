package cn.lakewater.saws.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @GetMapping(value = "/hello2")
    public String hello(){
        log.info("hello");
        return "hello eureka!";
    }

}
