package com.nsk.cloud.microserviceconfigclient.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nsk
 * 2018/11/18 23:22
 */
@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile(){
        return this.profile;
    }
}
