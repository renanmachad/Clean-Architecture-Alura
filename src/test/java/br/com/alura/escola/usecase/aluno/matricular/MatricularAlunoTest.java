package br.com.alura.escola.usecase.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {
    @Test
    void AlunoDeveriaSerPersistido(){
        // TESTE PODERIA SER UM MOCK
        RepositorioDeAlunosEmMemoria repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase= new MatricularAluno(repositorioDeAlunos);

        MatricularAlunoDTO dados= new MatricularAlunoDTO("renan","232.221.224-55","erwerew@gmail.com");
        useCase.executa(dados);

        Aluno buscarPorCPF=repositorioDeAlunos.buscarPorCPF(new CPF("232.221.224-55"));

        assertEquals("renan",buscarPorCPF.getNome());
        assertEquals("232.221.224-55",buscarPorCPF.getCpf());
        assertEquals("erwerew@gmail.com",buscarPorCPF.getEmail());
    }
}