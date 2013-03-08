package pkg1teste;

public class Main {

    public static void main(String[] args) {
        Escola Se = new Escola("Escola Basica e Secundaria 2,3 da Se Lamego", 44);
        Aluno a1 = new Aluno("Fabio", 10, Se);
        System.out.println("\n" + Se);
        System.out.println("\n" + a1);
    }
}
