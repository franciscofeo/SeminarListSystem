package br.com.abc.javacore.A7associacaoclasses.test;

import br.com.abc.javacore.A7associacaoclasses.classes.Aluno;
import br.com.abc.javacore.A7associacaoclasses.classes.Local;
import br.com.abc.javacore.A7associacaoclasses.classes.Professor;
import br.com.abc.javacore.A7associacaoclasses.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joaquim", 16);
        Aluno aluno2 = new Aluno("Carlitos", 15);
        Aluno aluno3 = new Aluno("Klaudeilton", 17);
        Aluno aluno4 = new Aluno("Teleusmar", 18);

        Professor prof1 = new Professor("Rodrigo dos Santos", "Física");
        Local local1 = new Local("Rua dos abacaxis", "Centro");
        Seminario seminario1 = new Seminario("Fisica Basica", prof1, local1, new Aluno[]{aluno1, aluno2});

        Professor prof2 = new Professor("Carlos Alberto", "Matematica aplicada");
        Local local2 = new Local("Rua das Cerejas", "Zona Leste");
        Seminario seminario2 = new Seminario("Matematica e a natureza", prof2, local2, new Aluno[]{aluno3,aluno4});

        seminario2.mostrarDados();



    }
}
