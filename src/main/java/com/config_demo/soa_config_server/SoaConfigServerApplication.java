package com.config_demo.soa_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer //开启Spring Cloud Config 服务端功能
@SpringBootApplication
public class SoaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaConfigServerApplication.class, args);
    }

}

//启动后请访问：http://localhost:7001/spring-cloud-config-client-dev.properties

