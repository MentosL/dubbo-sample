package xyz.lushun.api.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Montos
 * @create 2021/1/22 9:26 下午
 */
@Data
public class BaseResponse implements Serializable {

    Long time;

    String name;

    List<String> names;
}
