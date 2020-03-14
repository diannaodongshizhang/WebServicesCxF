package com.example.demo.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.CicularComputeService;
import com.example.demo.service.impl.SquComputeServiceImpl;

import javax.xml.ws.Endpoint;
 
@Configuration
public class CxfConfig {
 
    @Autowired
    private Bus bus;   //private SpringBus bus;
    @Autowired
    private CicularComputeService commonService;
 
    //  配置CXF服务发布，默认服务是在host:port/services/发布地址
    
    @Bean
    public Endpoint another_endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, commonService);
        endpoint.publish("/wsService1");   //发布地址
        return endpoint;
    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,  new SquComputeServiceImpl());
        endpoint.publish("/wsService2");    //发布地址
        return endpoint;
    }
}

