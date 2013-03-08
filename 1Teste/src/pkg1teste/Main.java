package pkg1teste;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primeira alteracao");
        System.out.println("EASY!");
        
        Escola Se = new Escola("Escola da Se Lamego", 44);
        Aluno a1 = new Aluno("Fabio", 10, Se);
        System.out.println(a1);
    }
}
