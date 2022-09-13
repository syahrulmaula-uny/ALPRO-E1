import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        String nama;
        int nilai;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nama dan nilai:");
        System.out.print("Masukan nama:");
        nama = scan.next();
        System.out.print("Masukan nilai:");
        nilai = scan.nextInt();
        if (nilai > 60) {
            System.out.println("Lulus");
        }else {
            System.out.println("tidak lulus");
        }
        System.out.println("Keterangan:" + nama);
    }
}