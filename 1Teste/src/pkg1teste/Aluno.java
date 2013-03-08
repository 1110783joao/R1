package pkg1teste;

public class Aluno {

    private String nome;
    private int idade;
    private Escola escola;

    public Aluno(String nome, int idade, Escola escola) {
        setNome(nome);
        setIdade(idade);
        this.escola=escola;
    }
    
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.isEmpty() ? "Sem nome" : nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade > 0 ? idade : 0;
    }
}
