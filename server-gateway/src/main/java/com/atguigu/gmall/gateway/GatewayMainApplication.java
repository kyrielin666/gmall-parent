package com.atguigu.gmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


/**
 * @author kyrie
 * @create 2022-08-23-15:14
 * 主启动类
 */
@SpringCloudApplication
//@EnableCircuitBreaker //开启服务熔断降级[1、导入jar]
//@EnableDiscoveryClient//开启服务发现 [1、导入服务发现jar 2、使用这个注解 ]
//@SpringBootApplication
public class GatewayMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMainApplication.class,args);
    }
}
