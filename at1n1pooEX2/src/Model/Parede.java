package Model;

public class Parede {



    private float altura;
    private float largura;


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }




    //métodos

    public float calcularArea(float lar, float alt) {
        return lar * alt;
    }

    public void tinta(float area){
        float tintaPorM2 = 0.3F; //
        float litrosPorLata = 2;

        double qtdLatasDeTinta =  Math.ceil((area * tintaPorM2) / litrosPorLata);

        System.out.println("será necessário " +qtdLatasDeTinta+ " latas de tinta");

    }

}
