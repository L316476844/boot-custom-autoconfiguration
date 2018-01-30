package org.jon.lv.server;

import java.util.List;

/**
 * Package: org.jon.lv.server.JonServer
 * Description: 描述
 * Copyright: Copyright (c) 2017
 *
 * @author lv bin
 * Version: V1.0.0
 */
public class JonServer {

    private int limit;

    private String name;

    private List<String> ipList;

    public String talk(String word){
        return name + ": " + word;
    }

    public int plus(int a, int b){

        int sum = a + b;

        return sum < limit ? sum : limit;
    }


    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }
}
