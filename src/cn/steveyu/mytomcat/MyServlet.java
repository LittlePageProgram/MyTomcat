package cn.steveyu.mytomcat;

import java.io.IOException;

public class MyServlet extends MyHttpServlet {
    @Override
    public void doGet(MyRequest request, MyResponse response) throws IOException {
        response.write("get tomcat");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws IOException {
        response.write("post tomcat");
    }
}
