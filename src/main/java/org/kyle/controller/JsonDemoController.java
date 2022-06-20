package org.kyle.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kyle1
 * @Description TODO
 * @Date 2022/6/20 10:47
 * @Version 1.0
 */
@RestController
public class JsonDemoController {

    @RequestMapping("/parase")
    public Object parase() {
        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "kyle12");
        String s = JSONObject.toJSONString(map);
        Map map1 = JSONObject.parseObject(s, Map.class);
        return map1;
    }
}
