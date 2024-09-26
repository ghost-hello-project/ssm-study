package com.laolang.ghost;

import com.laolang.ghost.bean.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Slf4j
public class HelloSchemaTest {

    private ApplicationContext context;

    @BeforeClass
    public void beforeClass() {
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    public void testHello() {
        HelloService helloService = context.getBean(HelloService.class);
        Assert.assertNotNull(helloService);
        Assert.assertEquals(helloService.sayHello(), "hello");
        log.info("helloService say:{}", helloService.sayHello());

    }
}
