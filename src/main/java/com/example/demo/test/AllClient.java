package com.example.demo.test;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class AllClient {
	public static void main(String[] args) {
        client1();
        client2();
        
    }
 
    // 创建动态客户端
    public static void client1() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/Service/wsService1?wsdl");
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("CicularCompute", 4);
            System.out.println("返回数据:" + objects[0]);
            client.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    // 创建动态客户端
    public static void client2() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/Service/wsService2?wsdl");
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("SquCompute", 3,5);
            System.out.println("返回数据:" + objects[0]);
            client.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
