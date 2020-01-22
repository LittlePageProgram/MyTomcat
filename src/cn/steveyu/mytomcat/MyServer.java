package cn.steveyu.mytomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    /**
     * 定义服务端的接收程序，接受socket请求
     * @param port
     */
    public static void startServer(int port) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 定义服务端套接字
        ServerSocket serverSocket = new ServerSocket(port);
        // 定义客户端套接字
        Socket socket = null;

        while (true){
            socket = serverSocket.accept();
            // 定义输入输出流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            // 定义请求对象
            MyRequest request = new MyRequest(inputStream);
            // 定义响应对象
            MyResponse response = new MyResponse(outputStream);

            // 获取映射
            String clazz = new MyMapping().getMapping().get(request.getRequestUrl());

            // 反射进行调用
            if(clazz != null) {
                Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
                MyServlet servlet = myServletClass.newInstance();
                servlet.service(request, response);
            }
        }
    }

    public static void main(String[] args) {
        try {
            startServer(8080);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
