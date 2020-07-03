package org.apache.rocketmq.example.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author guchenbo
 * @Date 2020/5/5.
 */
public class Test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1","v1");
        String v=map.putIfAbsent("k1","v2");
        System.out.println(v);
        System.out.println(map.get("k1"));
    }
}
