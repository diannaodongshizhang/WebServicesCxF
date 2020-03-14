package com.example.demo.service.impl;


import org.springframework.stereotype.Component;

import com.example.demo.service.CicularComputeService;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
@WebService( serviceName = "swService1",   //对外发布的服务名
        targetNamespace = "http://demo.example.com/",//指定想要的名称空间，通常使用interface接口包名反转
        endpointInterface = "com.example.demo.service.CicularComputeService")//服务接口interface全路径, 服务端点接口
 
@Component  //一般不会在接口上放注解，在实现类上注解，这样才符合热插拔式，如果后期更换实现类，直接注解其他实现类就可以。
public class CicularComputeServiceImpl implements CicularComputeService {
    @Override
    public Double CicularCompute(int r) {
        Double Pi=3.14;
    	return Pi*r*r;
    }
 
    
}


