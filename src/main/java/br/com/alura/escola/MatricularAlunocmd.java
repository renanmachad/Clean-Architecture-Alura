package br.com.alura.escola;

import br.com.alura.escola.usecase.aluno.matricular.MatricularAluno;
import br.com.alura.escola.usecase.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunocmd {
    public  static void main(String[] args){
        String nome= "";
        String cpf= "123.231.545-09";
        String email= "rwfwe@gmail.com";

        MatricularAluno matricularAluno= new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.Matricular(new MatricularAlunoDTO(nome,cpf,email));

    }
}
