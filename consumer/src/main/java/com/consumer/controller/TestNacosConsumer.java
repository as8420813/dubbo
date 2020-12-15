package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.provider.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moll
 * @date 2020/12/15 15:50
 */
@RestController
@RequestMapping("test")
public class TestNacosConsumer {
    @Reference
    private DemoService demoService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String getCounsumerTest() {
        return demoService.test("22");
    }
}
