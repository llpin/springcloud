package zmaj.eureka.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = HiServiceHystric.class)
public interface HiService {

    @GetMapping("/hi")
    String sayHi(@RequestParam(name = "name") String name);
}
