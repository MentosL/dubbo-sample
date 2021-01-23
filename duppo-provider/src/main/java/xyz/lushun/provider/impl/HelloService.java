package xyz.lushun.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import xyz.lushun.api.request.BaseRequest;
import xyz.lushun.api.response.BaseResponse;
import xyz.lushun.api.service.IHelloService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Montos
 * @create 2021/1/22 9:16 下午
 */
@DubboService(group = "provider", version = "${demo.service.version}")
public class HelloService implements IHelloService {

    @Override
    public String getString(String name) {
        return "montos";
    }

    @Override
    public String getOccurException(String name) {
        int i = 13/0;
        return "montos";
    }

    @Override
    public BaseResponse getMessage(BaseRequest request) {
        BaseResponse response = new BaseResponse();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+"");
        }
        response.setNames(list);
        response.setName("montos");
        response.setTime(121212L);
        return response;
    }
}
