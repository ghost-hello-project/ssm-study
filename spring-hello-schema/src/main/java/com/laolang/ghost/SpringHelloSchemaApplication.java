package com.laolang.ghost;

import com.laolang.ghost.bean.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringHelloSchemaApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        HelloService helloService = context.getBean(HelloService.class);
        log.info("helloService say:{}", helloService.sayHello());
    }
}
