package com.example.client.controller;

import com.example.client.feginInterface.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * UnifiedController
 *
 * @Description 客户端统一调用服务控制层
 * @Author Bernie【xiongyun100@163.com】
 * @Date 2020/3/15
 */
@RestController
@Slf4j
public class UnifiedController {
    //@Autowired
    //private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProductClient productClient;


    /*****
     * @Author Bernie
     * @Description 采用restTemplate的方式通信
     * @Date 20:36 2020/3/15
     * @Param []
     * @return java.lang.String
     **/
    //@GetMapping("getProductMsg")
   // public String getProductMsg(){
        //消息定义
        //String msg;

        //1.直接使用restTemplate,url固定
        //RestTemplate restTemplate = new RestTemplate();
        //msg = restTemplate.getForObject("http://localhost:9080/info",String.class);

        //2.利用LoadBalance通过应用名获取url，然后在使用restTemplate
        //RestTemplate restTemplate = new RestTemplate();
        //ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-one");
        //String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort())+"/info";
        //msg = restTemplate.getForObject(url,String.class);

        //3.利用注解loadBalance加持restTemplate方式(使用了RestTemplateConfig),url地址直接由应用名+请求路径;
        //msg = restTemplate.getForObject("http://microservice-one/info",String.class);
        //log.info("".equalsIgnoreCase(msg)?"this is fake msg! no service call!":msg);
        //return "".equalsIgnoreCase(msg)?"this is fake msg! no service call!":msg;
    //}

    /***
     * @Author Bernie
     * @Description 采用Fegin的方式通信
     * @Date 20:36 2020/3/15
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("getProductMsgByFegin")
    public String getProductMsgByFeign(){
        String msg = productClient.productInfo();

        log.info(msg);
        return msg;
    }
}
