package com.graphql.demo.controller;

import com.graphql.demo.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("response")
    public Response getResponse() {
        Response response = new Response();
        response.setInputOne("hi");
        response.setInputTwo("demo");
        response.setInputThree("getOne");
        return response;
    }

}
