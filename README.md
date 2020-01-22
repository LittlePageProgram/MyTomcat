# MyTomcat

### 介绍

一个简易的Tomcat的处理流程，方便理解Tomcat如何去处理程序

### 运行环境

JDK 1.8

### src文件概览

```bash
src

└── cn

  └── steveyu

​    └── mytomcat

​      ├── MyHttpServlet.java 自定义HttpServlet，处理Req和Res

​      ├── MyMapping.java 自定义类和路径映射

​      ├── MyRequest.java 自定义Request，解析HTTP协议头

​      ├── MyResponse.java 自定义Response，响应HTTP协议头

​      ├── MyServer.java 自定义服务器

​      └── MyServlet.java 自定义Servlet，测试用
```





