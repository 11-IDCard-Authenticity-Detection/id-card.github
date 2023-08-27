package com.boc.idcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class IDCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(IDCardApplication.class, args);
    }

}
