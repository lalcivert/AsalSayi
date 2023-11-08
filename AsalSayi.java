package day01;


public class AsalSayi {
    public static void main(String[] args) {
        for(int i = 2;i<=100;i++){
            int bolenSayisi = 0;

        for(int j= 2;j<=i;j++) {
            if(i%j==0){
                bolenSayisi++;
            }
        }
        if(bolenSayisi==1){
            System.out.print(i+" ");
        }
        }
    }
}
