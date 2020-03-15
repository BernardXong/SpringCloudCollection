package com.example.client.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig
 *
 * @Description restTemplate配置
 * @Author Bernie【xiongyun100@163.com】
 * @Date 2020/3/15
 */
@Component
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
