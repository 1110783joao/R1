package pkg1teste;

public class Escola {
    private String nome;
    private int numSalas;
    public Escola(String _n, int _nS){
        nome=_n;
        numSalas=_nS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }
    
    public String toString() {
        return "Nome: " + getNome() + "\nNumero de salas: " + getNumSalas();
    }
}
