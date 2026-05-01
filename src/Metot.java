import java.util.Scanner;

public class Metot {

    public static void toplama() {
        System.out.println("1. Iki sayinin toplamini yazdiran metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı gir : ");
        int sayi1 = sc.nextInt();
        System.out.print("İkinci sayıyı gir : ");
        int sayi2 = sc.nextInt();
        int sonuc = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + "= " + sonuc);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static double ortalama() {
        System.out.println("2. 1'den N'e kadar olan sayilarin ortalamasini donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            sayilar[i] = sc.nextInt();
        }
        int toplam = 0;
        for (int j = 0; j < n; j++) {
            toplam += sayilar[j];
        }
        double sonuc = 0;
        sonuc = toplam / n;
        System.out.println(n + " elemanlı dizinin ortalaması : " + sonuc);
        System.out.println("-----------------------------------------------------------------------------");
        return sonuc;
    }

    public static void diziToplama() {
        System.out.println("3. Bir dizinin elemanlarinin toplamini yazdiran metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            sayilar[i] = sc.nextInt();
        }
        int toplam = 0;
        for (int j = 0; j < n; j++) {
            toplam += sayilar[j];
        }
        System.out.println(n + " elemanlı dizinin toplamı : " + toplam);
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static double randomToplama() {
        System.out.println("3. Random oluşturulan bir dizinin elemanlarinin toplamini yazdiran metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Random oluştutulacak diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            sayilar[i] = (int) (Math.random() * 100);
        }
        int toplam = 0;
        for (int j = 0; j < n; j++) {
            toplam += sayilar[j];
        }
        System.out.print("Random oluşturulan dizinin elemanları :");
        for (int j = 0; j < n; j++) {
            System.out.print(sayilar[j] + " , ");
        }
        System.out.println();
        System.out.println("Random oluşturulmuş " + n + " elemanlı dizinin toplamı : " + toplam);
        System.out.println("-----------------------------------------------------------------------------");
        return toplam;
    }

    public static double randomOrtalama() {
        System.out.println("4. Random oluşturulacak bir dizinin elemanlarinin ortalamasini donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Random oluşturulacak diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            sayilar[i] = (int) (Math.random() * 100);
        }
        int toplam = 0;
        for (int j = 0; j < n; j++) {
            toplam += sayilar[j];
        }
        double sonuc = 0;
        sonuc = toplam / n;
        System.out.print("Random oluşturulan dizinin elemanları :");
        for (int j = 0; j < n; j++) {
            System.out.print(sayilar[j] + " , ");
        }
        System.out.println();
        System.out.println("Random oluşturulmuş " + n + " elemanlı dizinin ortalaması : " + sonuc);
        System.out.println("-----------------------------------------------------------------------------");
        return sonuc;
    }

    public static int enKucuk() {
        System.out.println("5. Bir dizideki en kucuk elemani donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            sayilar[i] = sc.nextInt();
        }
        int enK = sayilar[0];
        for (int j = 1; j < n; j++) {
            if (sayilar[j] < enK) {
                enK = sayilar[j];
            }
        }
        System.out.println("Oluşturduğunuz dizinin en küçük elemanı : " + enK);
        System.out.println("-----------------------------------------------------------------------------");
        return enK;
    }

    public static int enBuyuk() {
        System.out.println("6. Bir dizideki en buyuk elemani donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olsun : ");
        int n = sc.nextInt();
        int[] sayilar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            sayilar[i] = sc.nextInt();
        }
        int enB = sayilar[0];
        for (int j = 1; j < n; j++) {
            if (sayilar[j] > enB) {
                enB = sayilar[j];
            }
        }
        System.out.println("Oluşturduğunuz dizinin en küçük elemanı : " + enB);
        System.out.println("-----------------------------------------------------------------------------");
        return enB;
    }

    public static void vektorDonduren() {
        System.out.println("7. Iki vectorun toplamini donduren metot'u yapamadım");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void dotProduct() {
        System.out.println("8. Dot product islemini yapip sonucu donduren metot'u yapamadım");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static int matrisSatirKucuk() {
        System.out.println("9. Bir matristeki her satirindaki en kucuk elemanlari bulup donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Oluşturulacak matrisin satır sayısını girin : ");
        int satir = sc.nextInt();
        System.out.print("Oluşturulacak matrisin satırında kaç eleman olsun : ");
        int sutun = sc.nextInt();
        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır, " + (j + 1) + ". sütun elemanını gir : ");
                matris[i][j] = sc.nextInt();
            }
        }
        System.out.println("Oluşturmuş olduğunuz matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " - ");
            }
            System.out.println();
        }
        int enK = 0;
        for (int i = 0; i < satir; i++) {
            enK = matris[i][0];
            for (int j = 1; j < sutun; j++) {
                if (matris[i][j] < enK) {
                    enK = matris[i][j];
                }
            }
            System.out.printf((i + 1) + ". satırın en küçük elemanı: " + enK + "\n");
        }
        System.out.println("-----------------------------------------------------------------------------");
        return enK;
    }

    public static int matrisSatirBuyuk() {
        System.out.println("10. Bir matristeki her satirindaki en büyük elemanlari bulup donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Oluşturulacak matrisin satır sayısını girin : ");
        int satir = sc.nextInt();
        System.out.print("Oluşturulacak matrisin satırında kaç eleman olsun : ");
        int sutun = sc.nextInt();
        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır, " + (j + 1) + ". sütun elemanını gir : ");
                matris[i][j] = sc.nextInt();
            }
        }
        System.out.println("Oluşturmuş olduğunuz matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " - ");
            }
            System.out.println();
        }
        int enB = 0;
        for (int i = 0; i < satir; i++) {
            enB = matris[i][0];
            for (int j = 1; j < sutun; j++) {
                if (matris[i][j] > enB) {
                    enB = matris[i][j];
                }
            }
            System.out.printf((i + 1) + ". satırın en büyük elemanı: " + enB + "\n");
        }
        System.out.println("-----------------------------------------------------------------------------");
        return enB;
    }

    public static int matrisSutunKucuk() {
        System.out.println("11. Bir matristeki her sütundaki en kucuk elemanlari bulup donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Oluşturulacak matrisin satır sayısını girin : ");
        int satir = sc.nextInt();
        System.out.print("Oluşturulacak matrisin satırında kaç eleman olsun : ");
        int sutun = sc.nextInt();
        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır, " + (j + 1) + ". sütun elemanını gir : ");
                matris[i][j] = sc.nextInt();
            }
        }
        System.out.println("Oluşturmuş olduğunuz matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " - ");
            }
            System.out.println();
        }
        int enK = 0;
        for (int j = 0; j < sutun; j++) {
            enK = matris[0][j];
            for (int i = 0; i < satir; i++) {
                if (matris[i][j] < enK) {
                    enK = matris[i][j];
                }
            }
            System.out.printf((j + 1) + ". sütunun en küçük elemanı: " + enK + "\n");
        }
        System.out.println("-----------------------------------------------------------------------------");
        return enK;
    }

    public static int matrisSutunBuyuk() {
        System.out.println("12. Bir matristeki her sütundaki en buyuk elemanlari bulup donduren metot çalışıyor.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Oluşturulacak matrisin satır sayısını girin : ");
        int satir = sc.nextInt();
        System.out.print("Oluşturulacak matrisin satırında kaç eleman olsun : ");
        int sutun = sc.nextInt();
        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matrisin " + (i + 1) + ". satır, " + (j + 1) + ". sütun elemanını gir : ");
                matris[i][j] = sc.nextInt();
            }
        }
        System.out.println("Oluşturmuş olduğunuz matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " - ");
            }
            System.out.println();
        }
        int enB = 0;
        for (int j = 0; j < sutun; j++) {
            enB = matris[0][j];
            for (int i = 0; i < satir; i++) {
                if (matris[i][j] > enB) {
                    enB = matris[i][j];
                }
            }
            System.out.printf((j + 1) + ". sütunun en buyuk elemanı: " + enB + "\n");
        }
        System.out.println("-----------------------------------------------------------------------------");
        return enB;
    }
}