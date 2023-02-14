package br.com.alura.escola.usecase.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;

    /**
     * Constructor
     * @param repositorioDeAlunos
     */
    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public MatricularAluno(MatricularAlunoDTO dados, RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
        Aluno novo= dados.criarAluno();
    }
    // COMMAND
    public void executa(MatricularAlunoDTO dados){
        Aluno novo= dados.criarAluno();
        repositorioDeAlunos.matricular(novo);
    }
    /**
     *  Matricula Aluno no sistema
     * @param dados
     * @return void
     */
    public void Matricular(MatricularAlunoDTO dados){
        Aluno novo= dados.criarAluno();
    }
}
