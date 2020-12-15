package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moll
 * @date 2020/12/15 15:40
 */
/*@NacosPropertySource(dataId = "example", autoRefreshed = true)*/
@SpringBootApplication
@EnableDubbo //开启Dubbo的注解支持
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
