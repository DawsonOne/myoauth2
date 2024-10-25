package org.hbwxz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
    @GetMapping("/getting")
    public String createCommodity() {
        return "ResponseUtils.okResponse(null)";
    }
}
