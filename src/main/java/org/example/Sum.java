package org.example;

public class Sum {
    public static void main(String[] args){
        Calcular(2,5);

        System.out.println(Calcular(2,5));
        System.out.println(Calcular(2,5,8));


    }

    private static int Calcular(int i, int i1) {
        int sum4=(i+i1);

        return sum4;

    }
    private static int Calcular(int i, int i1,int i2) {
        int sum4=(i+i1+i2);


        return sum4;

    }

}
