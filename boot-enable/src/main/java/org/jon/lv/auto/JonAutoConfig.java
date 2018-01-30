package org.jon.lv.auto;

import org.jon.lv.config.JonConfig;
import org.jon.lv.server.JonServer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Package: org.jon.lv.auto.JonAutoConfig
 * Description: 描述
 * Copyright: Copyright (c) 2017
 *
 * @author lv bin
 * Version: V1.0.0
 */
@Configuration
@ConditionalOnClass(JonServer.class)
@EnableConfigurationProperties(JonConfig.class)
public class JonAutoConfig {

    private final JonConfig jonConfig;

    public JonAutoConfig(JonConfig jonConfig) {
        this.jonConfig = jonConfig;
    }

    @Bean
    public JonServer jonServer(){
        JonServer jonServer = new JonServer();

        jonServer.setLimit(jonConfig.getLimit());
        jonServer.setName(jonConfig.getName());
        jonServer.setIpList(jonConfig.getIpList());

        return jonServer;
    }
}
