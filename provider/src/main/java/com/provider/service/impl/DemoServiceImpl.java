package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.service.DemoService;

/**
 * @author moll
 * @date 2020/12/15 15:49
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String test(String param) {
        return "hello " + param;
    }
}
