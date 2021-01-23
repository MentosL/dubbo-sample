package xyz.lushun.api.service;

import xyz.lushun.api.request.BaseRequest;
import xyz.lushun.api.response.BaseResponse;

/**
 * @author Montos
 * @create 2021/1/22 9:13 下午
 */
public interface IHelloService {

    /**
     * 基础类型入参以及返回
     * @param name
     * @return
     */
    String getString(String name);

    /**
     * 基础类型发生异常情况
     * @param name
     * @return
     */
    String getOccurException(String name);

    /**
     * 对象属性
     * @param request
     * @return
     */
    BaseResponse getMessage(BaseRequest request);
}
