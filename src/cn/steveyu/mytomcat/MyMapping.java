package cn.steveyu.mytomcat;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyMapping {

    public static Map<String,String> mapping = new ConcurrentHashMap<>();

    static {
        mapping.put("/mytomcat","cn.steveyu.mytomcat.MyServlet");
    }

    public Map<String,String> getMapping(){
        return mapping;
    }
}
