package zmaj.eureka.ribbon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zmaj.eureka.ribbon.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){

        return helloService.hiService(name);
    }
}
