package Model;

public class Boletim {
    double notaUm;
    double notaDois;
    double notaTres;
    double notaQuatro;

    //métodos

    public void calculaMedia(double n1, double n2, double n3, double n4) {
        float media = (float) (n1 + n2 + n3 + n4) / 4;

        System.out.println("Média do estudante: " +media);
    }





    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double getNotaQuatro() {
        return notaQuatro;
    }

    public void setNotaQuatro(double notaQuatro) {
        this.notaQuatro = notaQuatro;
    }
}
