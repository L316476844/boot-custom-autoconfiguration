package org.jon.lv.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Package: org.jon.lv.annotation.EnableJonServer
 * Description: 描述
 * Copyright: Copyright (c) 2017
 *
 * @author lv bin
 * Version: V1.0.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(org.jon.lv.auto.JonAutoConfig.class)
@Documented
public @interface EnableJonServer {
}
