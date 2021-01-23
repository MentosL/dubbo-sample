package xyz.lushun.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lushun.api.request.BaseRequest;
import xyz.lushun.api.response.BaseResponse;
import xyz.lushun.api.service.IHelloService;

/**
 * @author Montos
 * @create 2021/1/22 9:32 下午
 */
@RestController
@RequestMapping("/api/hello/")
public class HelloController {

    @DubboReference(check = false, group = "provider", version = "${demo.service.version}")
    IHelloService helloService;


    @RequestMapping("{id}")
    public String hello(@PathVariable("id") Integer id){

        switch (id){
            case 1:
                return helloService.getString("name");
            case 2:
                return helloService.getOccurException("name");
            case 3:
                BaseRequest request = new BaseRequest();
                BaseResponse message = helloService.getMessage(request);
                System.out.println(message);
                return "success";
            default:
                return "succ";
        }
    }

}
