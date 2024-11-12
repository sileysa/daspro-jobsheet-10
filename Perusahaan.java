import java.util.Scanner;

public class Perusahaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2Responden, rata2Pertanyaan, rata2Keseluruhan;

        int[][] survei = new int[10][6];
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-"+(i+1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan nilai pertanyaan ke-"+(j+1)+"(1-5): ");
                survei[i][j] = sc.nextInt();
            }   
        }
        System.out.println("=====Rata-rata untuk setiap responden=====");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            rata2Responden = total/6;
            System.out.println("Rata-rata responden ke-"+(i+1)+": "+rata2Responden);
        }
        System.out.println("=====Rata-rata untuk setiap pertanyaan=====");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            rata2Pertanyaan = total/10;
            System.out.println("Rata-rata pertanyaan"+(j+1)+": "+rata2Pertanyaan);
        }
        System.out.println("=====Rata-rata keseluruhan=====");
        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        rata2Keseluruhan = totalKeseluruhan/(10*6);
        System.out.println("Rata-rata keseluruhan: "+rata2Keseluruhan);
    }
}           