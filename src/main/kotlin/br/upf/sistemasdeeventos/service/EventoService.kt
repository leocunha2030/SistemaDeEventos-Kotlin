package br.upf.sistemasdeeventos.service

import br.upf.sistemasdeeventos.model.Evento
import br.upf.sistemasdeeventos.repository.EventoRepository
import org.springframework.stereotype.Service


@Service
class EventoService(private val repository: EventoRepository) {
    fun listar(): List<Evento> {
        return repository.findAll()
        }

    fun buscaPorId(id: Long): Evento {
        return repository.findAll().first{
            it.id == id
        }
    }
}