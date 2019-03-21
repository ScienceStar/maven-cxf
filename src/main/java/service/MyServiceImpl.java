package service;

import org.example.mywsdl.IMyService;

import javax.jws.WebService;

/**
 *@program: maven-cxf
 *@description: 服务实现类
 *@author: liuxincheng
 *@create: 2019-03-21 15:12
 */
@WebService(endpointInterface="org.example.mywsdl.IMyService",
        targetNamespace="http://www.example.org/mywsdl/",
        wsdlLocation= "META-INF/mywsdl.wsdl")
public class MyServiceImpl implements IMyService {
    @Override
    public int add(int a, int b) {
        int result = a+b;
        System.out.println("The result is:"+result);
        return result;
    }

    @Override
    public int minus(int c, int d) {
        int result = c - d;
        System.out.println("The result is:"+result);
        return result;
    }
}