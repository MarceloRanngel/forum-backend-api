package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.model.Topico
import br.com.alura.forum.service.AuthorService
import br.com.alura.forum.service.CursoService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(private val cursoService: CursoService, private val authorService: AuthorService): Mapper<NovoTopicoForm, Topico>{




    override fun map(t: NovoTopicoForm): Topico {
        return Topico (
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            author = authorService.buscarPorId(t.idAutor)
                )
    }

}
