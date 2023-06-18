package com.example.springbootapp

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Controller {

    @GetMapping("/health")
    fun health(): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }
}