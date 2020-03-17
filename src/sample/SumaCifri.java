package sample;

import java.util.Scanner;

public class SumaCifri {
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi su: ");
        for(int i=1; i<=n; i++) {
            if(SumaCifara(i) == true) System.out.println(i);
        }
    }

    private static boolean SumaCifara(int broj) {
        int zbir=0;
        int temp=broj;
        if(broj<1) return false;
        if(broj%10==broj) return true;
        while(true) {
            zbir+=(temp%10);
            temp/=10;
            if(temp==0) break;
        }
        if(broj%zbir==0) return true;
        return false;
    }
}
