package org.jon.lv;

import org.jon.lv.annotation.EnableJonServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package: org.jon.lv.BootEnableApp
 * Description: 描述
 * Copyright: Copyright (c) 2017
 *
 * @author lv bin
 * Version: V1.0.0
 */
@EnableJonServer
@SpringBootApplication
public class BootEnableApp {

    public static void main(String[] args) {
        SpringApplication.run(BootEnableApp.class, args);
    }
}
