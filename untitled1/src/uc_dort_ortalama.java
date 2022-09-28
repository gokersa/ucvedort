import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class uc_dort_ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, kacSayi=0, toplam=0;
        double average;
        System.out.print("Hangi sayıya kadar hesap yapılacağını yazınız:");
        k = input.nextInt();

        // toplam =+ i  3 ve 4'e aynı anda bölünen sayıların toplamını, kacSayi ++ kaç tane böyle sayı olduğunu gösteriyor.
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {

            toplam=+  i;
            kacSayi ++;

            }
        }
        // kacSayi -1 yazmamızın sebebi 0'dan itibaren saymaya başlaması
        average = toplam / (kacSayi-1);

        // Sistem çıktısını yazdıralım.
        System.out.print("3 ve 4'e aynı anda bölünebilen sayıların ortalaması:" + average);


    }
}
