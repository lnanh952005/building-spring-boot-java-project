package com.HELLOWORLD.spring.API;

import com.HELLOWORLD.spring.REPOSITORY.repositoryIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newAPI {

    @GetMapping(value = "/api/hello")
    public String test(){
        return  null;

    }
}
