package test

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class TestController {

    @PostMapping(value = ["/test"])
    fun getTestData(@RequestBody testRequest: String): ResponseEntity<String> {
        return ResponseEntity.ok().build()
    }
}