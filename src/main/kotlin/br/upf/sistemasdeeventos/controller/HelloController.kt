package br.upf.sistemasdeeventos.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/palavras")
class HelloController {
    @GetMapping("/1")
    fun hello(): String{
        return "Hello World!"
    }
    @GetMapping("/2")
    fun Ola(): String{
        return "Ola mundo"
    }
}