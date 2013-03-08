package pkg1teste;

public class Main {

    public static void main(String[] args) {
        Escola Se = new Escola("Escola Basica e Secundaria 2,3 da Se Lamego", 44);
        Escola isep = new Escola("ISEP", 444);
        System.out.println("\n" + Se);
        System.out.println("\n" + isep);
        
        Aluno a1 = new Aluno("Fabio", 10, Se);
        System.out.println("\n" + a1);
        
        Aluno a2 = new Aluno("Joao", 69, Se);
        System.out.println("\n" + a2);
        
        Aluno a3 = new Aluno("Joao Costa", 19, isep);
        System.out.println("\n" + a3);
    }
}
