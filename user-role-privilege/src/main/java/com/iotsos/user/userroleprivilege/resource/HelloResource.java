package com.iotsos.user.userroleprivilege.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JoeDims on 7/14/2019.
 */
@RequestMapping("/rest/hello")
@RestController
public class HelloResource {
    @GetMapping("/all")
    public String hello(){
        return "Is waar dar";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello(){
        return "Secured - Is waar dar";
    }
}
