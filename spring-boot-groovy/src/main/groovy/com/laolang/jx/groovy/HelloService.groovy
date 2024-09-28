package com.laolang.jx.groovy

import org.springframework.stereotype.Component

@Component
class HelloService {

    String sayHello() {
        return 'hello world'
    }
}
