package cn.pang.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloController {
    //你好呀
    @RequestMapping
    public String uu(){
        System.out.println("1212");
        return "uu";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
