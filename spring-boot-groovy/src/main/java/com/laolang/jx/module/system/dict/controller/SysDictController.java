package com.laolang.jx.module.system.dict.controller;

import com.laolang.jx.groovy.HelloService;
import groovy.lang.Binding;
import groovy.lang.Script;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("admin/system/dict")
@RestController
public class SysDictController {

    private final HelloService helloService;

    @GetMapping("typeList")
    public Map<String, Object> typeList() {
        // 使用 groovy 定义 bean
        log.info("say:{}", helloService.sayHello());

        // 加载 groovy 脚本
        GroovyScriptEngine engine = null;
        try {
            engine = new GroovyScriptEngine("E:/github/ghost-hello-project/ssm-study/spring-boot-groovy/src/main/resources/groovy");
            Script script = engine.createScript("HelloGroovy.groovy", new Binding());
            log.info("groovy result:{}", script.invokeMethod("hello", "laolang"));
        } catch (IOException | ResourceException | ScriptException e) {
            log.error("script error:{}", ExceptionUtils.getMessage(e));
        }

        Map<String, Object> map = new HashMap<>();
        map.put("group", "system");
        return map;
    }
}

