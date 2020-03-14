package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
 
@WebService(name = "swService1",    // 暴露服务名称
            targetNamespace = "http://demo.example.com/")//命名空间,一般是interface的包名倒序
 
public interface CicularComputeService {
    @WebMethod //标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
    @WebResult(name = "Double", targetNamespace = "")
    public Double CicularCompute(@WebParam(name = "r") int r);
 
   
}

