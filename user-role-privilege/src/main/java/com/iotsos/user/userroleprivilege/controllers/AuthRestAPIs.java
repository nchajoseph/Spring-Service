package com.iotsos.user.userroleprivilege.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by JoeDims on 7/29/2019.
 */
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/auth")
public class AuthRestAPIs {

    @GetMapping("/check")
    public String checkApi(){
        return "### Check APIs";
    }

    @PostMapping("/login")
    public ResponseEntity<?> authentication (@Valid @RequestBody String Body){
        return ResponseEntity.ok("### "+Body);
    }

}
