package com.self.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping(value = "/api")
public class TestController {

    @ApiOperation(value = "testing spring config")
    @GetMapping(value = "/test")
    public String test() {
        return "testing successful";
    }
}
