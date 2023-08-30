package br.upf.sistemasdeeventos.repository

import br.upf.sistemasdeeventos.model.Evento
import br.upf.sistemasdeeventos.model.StatusEvento
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class EventoRepository(private var eventos: MutableList<Evento>) {
    init {
        val hoje = LocalDate.now()
        val evento1 = Evento(
            id = 1,
            nome = "UPF em Dança" ,
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays( 10),
            dataFimInsc = hoje.atStartOfDay().plusDays( 20),
            descricao = "Melhor evento de Dança de Passo Fundo" ,
            status = StatusEvento.PREVISTO,
            inscritos = listOf()
        )
        val evento2 = Evento(
            id = 2,
            nome = "UPF em CORRIDA" ,
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays( 10),
            dataFimInsc = hoje.atStartOfDay().plusDays( 20),
            descricao = "Melhor evento de CORRIDA de Passo Fundo" ,
            status = StatusEvento.PREVISTO,
            inscritos = listOf()
        )
        val evento3 = Evento(
            id = 3,
            nome = "UPF em LUTA" ,
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays( 10),
            dataFimInsc = hoje.atStartOfDay().plusDays( 20),
            descricao = "Melhor evento de LUTA de Passo Fundo" ,
            status = StatusEvento.PREVISTO,
            inscritos = listOf()
        )
        eventos = mutableListOf(evento1, evento2, evento3)
    }
    fun findAll() = eventos
}