package com.orangefororange.accountingmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.orangefororange.*.infrastructure.mapper")
@SpringBootApplication
public class AccountingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountingManagementApplication.class, args);
    }

}
