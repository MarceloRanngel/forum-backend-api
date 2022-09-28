package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*


@Service
class AuthorService(var authors: List<Usuario>) {

    init{
        val author = Usuario(
            id = 1,
            nome = "Rangel",
            email = "email@email.com"
        )

        authors = Arrays.asList(author)
    }

    fun buscarPorId(id: Long): Usuario {
        return authors.stream().filter { a ->
            a.id == id
        }.findFirst().get()
    }
}