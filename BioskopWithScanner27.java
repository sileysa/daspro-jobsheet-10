import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu 1/2/3: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu==1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris 1-4: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom 1-2: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Input tidak valid!");
                }else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi! Silahkan pilih kursi lain.");
                } else {
                    nama = penonton[baris - 1][kolom - 1];
                    System.out.println("Data penonton berhasil ditambahkan");
                    continue;
                }
            } else if (menu==2) {
                System.out.println("-----Daftar penonton-----");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j]!=null) {
                            System.out.println("Baris "+(i+1)+", kolom "+(j+1)+ ": "+penonton[i][j]);
                        } else {
                            System.out.println("Baris "+(i+1)+", kolom "+(j+1)+ ": ***");
                        }
                    }
                }
            } else if (menu==3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak tersedia!");
            }
        }
    }
}
