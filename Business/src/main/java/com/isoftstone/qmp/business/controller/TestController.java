package com.isoftstone.qmp.business.controller;

import com.isoftstone.qmp.business.service.TestService;
import com.isoftstone.qmp.common.core.RestResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequiresPermissions("user:test")
    @GetMapping("/test")
    public RestResult test() {
        return RestResult.success(testService.getAllUser());
    }


    @RequiresPermissions("user:get")
    @GetMapping("/get")
    public String getUser() {
        if (true) {
            throw new RuntimeException("CS");
        }
        return "user";
    }
}
