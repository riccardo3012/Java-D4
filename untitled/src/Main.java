
public class Main {
    public static void main(String[] args) {

        Dipendente marco=new Dipendente( "OPERAIO", "Produzione" );
        marco.setStraordinari(10);
       
        System.out.println(marco);

        Dipendente luca=new Dipendente( "DIRIGENTE", "VENDITE" );
        luca.setStraordinari(5410);
        System.out.println(luca);
    }
}