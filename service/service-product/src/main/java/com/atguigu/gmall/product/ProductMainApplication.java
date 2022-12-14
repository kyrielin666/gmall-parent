package com.atguigu.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author kyrie
 * @create 2022-08-23-17:26
 */
@MapperScan("com.atguigu.gmall.product.mapper")//自动扫描这个包下的所有mapper接口
@SpringCloudApplication
public class ProductMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class,args);
    }
}
