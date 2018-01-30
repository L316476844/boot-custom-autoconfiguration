package org.jon.lv.controller;

import org.jon.lv.server.JonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: org.jon.lv.controller.JonController
 * Description: 描述
 * Copyright: Copyright (c) 2017
 *
 * @author lv bin
 * Version: V1.0.0
 */
@RestController
@RequestMapping("/")
public class JonController {
    @Autowired
    private JonServer jonServer;

    @GetMapping("/jon")
    public String jon(@RequestParam("word") String word){

        return jonServer.talk(word);
    }

    @GetMapping("/plus")
    public int plus(@RequestParam("a") int a,@RequestParam("b") int b){

        return jonServer.plus(a, b);
    }
}
