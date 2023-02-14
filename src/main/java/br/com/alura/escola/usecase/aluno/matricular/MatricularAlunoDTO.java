package br.com.alura.escola.usecase.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private String nome;
    private String cpf;
    private String email;

    public MatricularAlunoDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Aluno criarAluno(){
        return new Aluno(new CPF(cpf),nome,new Email(email));
    }
}
