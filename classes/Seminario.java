package br.com.abc.javacore.A7associacaoclasses.classes;



public class Seminario {
    private String titulo;
    private Professor professor;
    private  Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Professor professor, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
        this.alunos = alunos;
    }

    public void showAlunos(Aluno[] alunos){ // pega cada posição do array para ser mostrado
        System.out.print("Alunos confirmados: ");
        for (Aluno aluno: alunos){
            System.out.print(aluno.getNome() + ", ");
            aluno.setSeminario(this);
        }
    }

    public void mostrarDados(){
        System.out.println("\n-------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + local.getRua() + ", " + local.getBairro());
        System.out.println("Apresentador(a): " + this.professor.getNome());
        System.out.println("Quantidade de alunos confirmados: " + alunos.length);
        showAlunos(this.alunos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
