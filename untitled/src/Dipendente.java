public class Dipendente {
    public static double stipendioBase = 1000;
    private static int prossimaMatricola =1;
    private int matricola;
    private double stipendio;
    public double straordinari;
    private String livello;
    public String dipartimento;
    public Dipendente ( String livello, String dipartimento){
     this.matricola = prossimaMatricola++;
     this.livello = livello;
     this. dipartimento = dipartimento;
     this.straordinari = 0.0;
     calcoloStipendio();
    }
    private void calcoloStipendio () {
        double stipendioBaseLivello = stipendioBase;
        switch (livello) {
            case "OPERAIO":
                stipendioBaseLivello+=500;

                break;
            case "IMPIEGATO":
                stipendioBaseLivello+=1000;

                break;
            case "QUADRO":
                stipendioBaseLivello+=1500;

                break;
            case "DIRIGENTE":
                stipendioBaseLivello+=3000;

                break;
        }
        double stipendioTotale = stipendioBaseLivello + (straordinari*11);
        this.stipendio = stipendioTotale;
    }
            public void setStraordinari(double importo) { //setter colcola straordinari + lvl+ base
            this.straordinari = importo;
            calcoloStipendio();

        }
//Getter-setter
    public static double getStipendioBase() {
        return stipendioBase;
    }

    public static void setStipendioBase(double stipendioBase) {
        Dipendente.stipendioBase = stipendioBase;
    }

    public static int getProssimaMatricola() {
        return prossimaMatricola;
    }

    public static void setProssimaMatricola(int prossimaMatricola) {
        Dipendente.prossimaMatricola = prossimaMatricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStraordinari() {
        return straordinari;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", straordinari=" + straordinari +
                ", livello='" + livello + '\'' +
                ", dipartimento='" + dipartimento + '\'' +
                '}';
    }
}
