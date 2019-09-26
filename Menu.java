import java.util.*;

class Menu {

    public static int menu() {
        Scanner s = new Scanner(System.in);
        int result = 0;

        System.out.println("\nMenu");
        System.out.println("1. Sistem Persamaan Linier");
        System.out.println("2. Determinan");
        System.out.println("3. Matriks Balikan");
        System.out.println("4. Matriks Kofaktor");
        System.out.println("5. Adjoin");
        System.out.println("6. Interpolasi Polinom");
        System.out.println("7. Keluar\n==============");

        System.out.print("Masukan: ");

        result = s.nextInt();

        return result;
    }

    public static int menuInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n1. Input dari Keyboard");
        System.out.println("2. Input dari File\n==============");
        System.out.print("Masukan: ");

        int result = s.nextInt();

        return result;
    }

    public static int spl() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n1. Metode Eliminasi Gauss");
        System.out.println("2. Metode Eliminasi Gauss-Jordan");
        System.out.println("3. Metode Matriks Balikan");
        System.out.println("4. Kaidah Cramer\n==============");
        System.out.print("Masukan: ");

        int result = s.nextInt();

        return result;
    }

    public static int determinan() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n1. Metode Operasi Baris Elementer");
        System.out.println("2. Metode Matriks Kofaktor\n==============");
        System.out.print("Masukan: ");

        int result = s.nextInt();

        return result;
    }

    public static int invers() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n1. Metode Adjoin");
        System.out.println("2. Metode Eliminasi Gauss-Jordan\n==============");
        System.out.print("Masukan: ");

        int result = s.nextInt();

        return result;
    }

    public static void Run() {
        boolean jalan = true;
        int menu, spl, determinan, invers;
        while (jalan) {
            menu = Menu.menu();
            if (menu == 1) {
                spl = Menu.spl();
                if (spl == 1) {
                    SPL.SPLGauss("x");
                } else if (spl == 2) {
                    SPL.SPLGaussJordan("x");
                } else if (spl == 3) {
                    SPL.SPLInvers("x");
                } else if (spl == 4) {
                    SPL.SPLCramer("x");
                } else {
                    System.out.println("Perintah tidak tersedia");
                }
            } else if (menu == 2) {
                determinan = Menu.determinan();
                if (determinan == 1) {
                    Determinan.DeterminanOBE();
                } else if (determinan == 2) {
                    Determinan.DeterminanCofaktor();
                } else {
                    System.out.println("Perintah tidak tersedia");
                }
            } else if (menu == 3) {
                invers = Menu.invers();
                if (invers == 1) {

                } else if (invers == 2) {

                } else {
                    System.out.println("Perintah tidak tersedia");
                }
            } else if (menu == 4) {
                Matriks M = Input.InputMatriks(true);

                M.TulisMat();
                M.MatCofaktor();
                System.out.println();
                M.TulisMat();
            } else if (menu == 5) {
                Matriks M = Input.InputMatriks(true);

                M.Adjoin();
                M.TulisMat();
            } else if (menu == 6) {
                Interpolasi.Cari();
            } else if (menu == 7) {
                break;
            } else {
                System.out.println();
                System.out.println("Menu Tidak Valid");
            }
        }
    }
}