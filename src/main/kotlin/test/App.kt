package test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class App: SpringBootServletInitializer()

fun main(args: Array<String>) {
    runApplication<App>(*args)
}