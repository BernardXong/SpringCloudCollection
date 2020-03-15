package com.example.client.feginInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ProductClient
 *
 * @Description 服务端调用接口定义
 * @Author Bernie【xiongyun100@163.com】
 * @Date 2020/3/15
 */
@FeignClient(name="microservice-one")
public interface ProductClient {

    @GetMapping("/info")
    String productInfo();
}
