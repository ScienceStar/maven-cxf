package core;

import service.MyServiceImpl;

import javax.xml.ws.Endpoint;

/**
 *
 * @program: maven-cxf
 * @description: 服务主类
 * @author: liuxincheng
 * @create: 2019-03-21 15:15
 */
public class ServerCore {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8989/ms", new MyServiceImpl( ));
        System.out.println("The service is running.................");
    }
}