package com.blockChain.demo.controller;

import com.blockChain.demo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YJL
 * @create 2022-10-02 15:46
 */
@Api(tags = "注册")
@RestController
public class RegController {


    @ApiOperation(value = "注册")
    @PostMapping("/reg")
    public void login(@RequestBody User user){

    }
}
