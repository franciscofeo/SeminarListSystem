package br.com.abc.javacore.A7associacaoclasses.classes;

public class Aluno {
    private String nome;
    private double idade;
    private Seminario seminario;

    public Aluno(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInfo(){
        System.out.println("\n---------------------------------");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade do aluno: " + this.idade);
        if(this.seminario != null) {
            System.out.println("Seminário em que o aluno está inscrito: " + this.seminario.getTitulo());
            return;
        }
        System.out.println("O aluno não está inscrito em nenhum seminário.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
