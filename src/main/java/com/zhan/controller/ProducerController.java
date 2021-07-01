package com.zhan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 服务提供者测试
 * @Author zhanzhan
 * @Date 2021/7/1 10:05
 */
@RestController
@RequestMapping("producer")
public class ProducerController {

    @RequestMapping("hello")
    public String hello() {

        return "hello consul 8778";
    }
}
