package xyz.lushun.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Montos
 * @create 2021/1/22 9:26 下午
 */
@Data
public class BaseRequest implements Serializable {

    String name;

    Long time;
}
