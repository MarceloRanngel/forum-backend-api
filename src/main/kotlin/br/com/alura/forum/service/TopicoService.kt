package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service


@Service
class TopicoService(private var topicos: List<Topico>) {

    init{
        val topico1 = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "kotlin",
                categoria = "Programacao"
            ),
            author = Usuario(
                id = 1,
                nome = "Rangel",
                email = "marcelo.rcs@icloud.com"
            )

        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Java",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "kotlin",
                categoria = "Programacao"
            ),
            author = Usuario(
                id = 1,
                nome = "Rangel",
                email = "marcelo.rcs@icloud.com"
            )

        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Ruby",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "kotlin",
                categoria = "Programacao"
            ),
            author = Usuario(
                id = 1,
                nome = "Rangel",
                email = "marcelo.rcs@icloud.com"
            )

        )

        topicos =  listOf(topico1, topico2, topico3)
    }

    fun listar(): List<Topico>{
        return topicos
    }
}