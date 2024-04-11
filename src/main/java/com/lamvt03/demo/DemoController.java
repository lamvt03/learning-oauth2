package com.lamvt03.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {


    @GetMapping("hello")
    public String sayHello(){
        return "say hello from secured endpoint";
    }

    @GetMapping("user")
    public ResponseEntity<?> getUser(
            @AuthenticationPrincipal AuthenticatedPrincipal user
            ){
        return ResponseEntity.ok(user);
    }
}
