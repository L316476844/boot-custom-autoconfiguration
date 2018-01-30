package org.jon.lv.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: org.jon.lv.config.JonConfig
 * Description: 描述
 * Copyright: Copyright (c) 2017
 * @author lv bin
 * Version: V1.0.0
 */
@ConfigurationProperties(prefix = "jon.lv")
public class JonConfig {

    private int limit;

    private String name;

    private List<String> ipList = new ArrayList<>();

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
}
