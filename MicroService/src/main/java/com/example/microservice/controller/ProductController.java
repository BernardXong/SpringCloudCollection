package com.example.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 *
 * @Description 商品服务相关
 * @Author Bernie【xiongyun100@163.com】
 * @Date 2020/3/15
 */
@RestController
@Slf4j
public class ProductController {

    @GetMapping("/info")
    public String getProductionInfo(){
        return "ok,your goods,name is WaHaHa water！";
    }
}
