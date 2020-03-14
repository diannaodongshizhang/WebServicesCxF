package com.example.demo.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
 
@WebService(name = "wsService2",                                      //暴露服务名称。
            targetNamespace = "http://demo.example.1com/")//命名空间,一般是接口(interface)的包名倒序
 
public interface SquComputeService {
 
    @WebResult(name = "int", targetNamespace = "")
    public int SquCompute(@WebParam(name = "x") int x,@WebParam(name = "y") int y);
}

