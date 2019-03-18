package com.imi.dolphin.sdkwebservice.controller;

import com.imi.dolphin.sdkwebservice.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imi.dolphin.sdkwebservice.model.ExtensionRequest;
import com.imi.dolphin.sdkwebservice.property.AppProperties;
import com.imi.dolphin.sdkwebservice.reposit.BlogRespository;
import com.imi.dolphin.sdkwebservice.service.IMailService;
import com.imi.dolphin.sdkwebservice.service.IService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    IService svcService;

    @Autowired
    IMailService svcMailService;
    
    @Autowired
    BlogRespository blogRespository;
    
    @RequestMapping("/blogCustom")
    @PostMapping
    public Blog blogCustom(@RequestBody ExtensionRequest extensionRequest) {
        return blogRespository.save(svcService.cobaCustom(extensionRequest));
    }
    
    @GetMapping("/blog")
    public String index(){
        String a = "{ \"data\" : "+blogRespository.findAll()+"}";
        return a;
    }
}
