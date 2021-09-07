import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int i = 0;
        int n = 0;
        int max = 10;
        String temp;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>(max);
        ArrayList<Integer> kode = new ArrayList<>(max);

        System.out.print("Masukkan jumlah data: ");
        n = sc.nextInt();

        while (n > max){
            System.out.println("Nilai yang dimasukkan jangan melebihi 10.\n");
            System.out.print("Masukkan jumlah data: ");
            n = sc.nextInt();
        }

        for (i = 0; i <= n-1; i++){
            int j = i+1;
            System.out.print("Masukkan data ke-" + j + " : ");
            temp = sc.next();
            nama.add(temp);
            kode.add(i+100);
        }

        System.out.println("\nDaftar (Kode - Nama):");
        for (i = 0; i <= n-1; i++){
            System.out.println(kode.get(i) + " - " + nama.get(i));
        }

    }
}
