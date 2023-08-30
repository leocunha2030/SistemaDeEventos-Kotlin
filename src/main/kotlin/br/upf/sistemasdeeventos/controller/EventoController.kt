package br.upf.sistemasdeeventos.controller

import br.upf.sistemasdeeventos.model.Evento
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import br.upf.sistemasdeeventos.service.EventoService
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/eventos")
class EventoController(
    val service: EventoService) {

    @GetMapping
    fun listar (): List<Evento>{
        return service.listar()
    }
    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Evento{
        return service.buscaPorId(id)
    }
}