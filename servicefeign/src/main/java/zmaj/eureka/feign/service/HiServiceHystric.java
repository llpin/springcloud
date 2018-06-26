package zmaj.eureka.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayHi(String name) {
        return "Sorry " + name;
    }
}
