package Model;

public class ordena {
    int num1;
    int num2;
    int num3;

    //metodos

    public void comp(int n1, int n2, int n3){
        int menor = n1;
        int maior = 0;
        int mid = 0;

        if (n1 > maior){
            maior = n1;
        }
        if (n2 > maior){
            maior = n2;
        }
        if (n3 > maior){
            maior = n3;
        }

        if (n2 < menor){
            menor = n2;
        }
        if (n3 < menor){
            menor = n3;
        }

        if (n1 > menor && n1 < maior){
            mid = n1;
        }
        if (n2 > menor && n2 < maior){
            mid = n2;
        }
        if (n3 > menor && n3 < maior){
            mid = n3;
        }



        System.out.println("ordem crescente: " +menor + " " +mid + " " +maior);

    }





    //gets sets

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
