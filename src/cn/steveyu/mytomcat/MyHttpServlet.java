package cn.steveyu.mytomcat;

import java.io.IOException;

public abstract class MyHttpServlet {

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";

    public abstract void doGet(MyRequest request,MyResponse response) throws IOException;
    public abstract void doPost(MyRequest request,MyResponse response) throws IOException;

    /**
     * 根据请求方式来判断调用哪种处理方法
     * @param request
     * @param response
     */
    public void service(MyRequest request,MyResponse response) throws IOException {
        if(request.getRequestMethod().equals(METHOD_GET)) {
            doGet(request, response);
        }else if(request.getRequestMethod().equals(METHOD_POST)) {
            doPost(request, response);
        }
    }
}
