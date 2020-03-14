package com.example.demo.service.impl;

import javax.jws.WebService;

import com.example.demo.service.SquComputeService;
 
//@WebService表示该类是一个服务类，需要发布其中的public的方法
@WebService(serviceName = "wsService2",      // 该webservice服务的名称,与接口中指定的name一致,对外发布的服务名
        targetNamespace = "http://demo.example.1com/",   //名称空间，通常使用接口包名反转
        endpointInterface = "com.example.demo.service.SquComputeService")  //服务接口全路径
 
public class SquComputeServiceImpl implements SquComputeService {
 
    @Override
    public int SquCompute(int x,int y) {
        
        return x*y;
    }
}
