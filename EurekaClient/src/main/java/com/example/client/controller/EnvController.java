package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EnvController
 *
 * @Description 配置获取
 * @Author Bernie【xiongyun100@163.com】
 * @Date 2020/3/20
 */
@RestController
@RequestMapping("/env")
public class EnvController {
    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print(){
        return env;
    }
}
