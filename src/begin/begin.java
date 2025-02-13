//1
/*
import java.util.Scanner;

public class begin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadratning tomoni a ni kiriting: ");
        double a = scanner.nextDouble();
        double perimeter = 4 * a;

        System.out.println("Kvadratning perimetri: " + perimeter);

    }
}
*/

//2
/*import java.util.Scanner;

public class begin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a ni kiriting: ");
        double a = scanner.nextDouble();
        double s = a * a;

        System.out.println("kvadrat s maydoni " + s);
    }
}*/

//3
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("To'rtburchakning a tomonini kiriting: ");
//        double a = scanner.nextDouble();
//        System.out.print("To'rtburchakning b tomonini kiriting: ");
//        double b = scanner.nextDouble();
//
//        double area = a * b;
//
//        double perimeter = 2 * (a + b);
//
//        System.out.println("To'rtburchakning maydoni: " + area);
//        System.out.println("To'rtburchakning perimetri: " + perimeter);
//
//
//    }
//}
//4

//import java.util.Scanner;
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Aylana d tomoni: ");
//        double d = scanner.nextDouble();
//
//        double L = 3.14 * d;
//
//        System.out.println("Aylana maydoni: " + d);
//
//    }
//}

//5

//import java.util.Scanner;
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Aylana a tomoni: ");
//        int a = scanner.nextInt();
//
//
//        int kub = a * a * a;
//        int sirt = 6 * (a * a);
//
//        System.out.println("Kubning hajmi: " + kub);
//        System.out.println("Kubning sirt maydoni: " + sirt);
//
//    }
//}

//6
//import java.util.Scanner;
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Aylana a tomoni: ");
//        int a = scanner.nextInt();
//        System.out.print("Aylana b tomoni: ");
//        int b = scanner.nextInt();
//        System.out.print("Aylana c tomoni: ");
//        int c = scanner.nextInt();
//
//
//        int V = a * b * c;
//        int s = 2 * (a * b + b * c + a * c) ;
//
//        System.out.println("Kubning hajmi: " + V);
//        System.out.println("Kubning sirt maydoni: " + s);
//
//    }
//}

//7
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Aylana radiusini kiriting (r): ");
//        double r = scanner.nextDouble();
//
//        double L = 2 * 3.14 * r;
//
//        double s = 3.14 * (r * r);
//
//        System.out.println("Aylananing uzunligi: " + L);
//        System.out.println("Aylananing maydoni: " + s);
//    }
//}

//8
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Aylana radiusini kiriting a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Aylana radiusini kiriting b: ");
//        double b = scanner.nextDouble();
//
//        double ortacha = (a + b) / 2;
//
//
//        System.out.println("ortachasi: " + ortacha);
//    }
//}

//9
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("a sonini kiriting: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b sonini kiriting: ");
//        double b = scanner.nextDouble();
//
//        double geometric = Math.sqrt(a * b);
//
//        System.out.println("a va b sonlarining geometrik o'rtachasi: " + geometric);
//
//        scanner.close();
//    }
//}

//10
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("a sonini kiriting: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b sonini kiriting: ");
//        double b = scanner.nextDouble();
//
//        double sumSquares = (a * a) + (b * b);
//
//        double difference = a - b;
//
//        double product = a * b;
//
//        double division = a / b;
//
//        System.out.println("a va b ning kvadratlari yig'indisi: " + sumSquares);
//        System.out.println("a va b ning ayirmasi: " + difference);
//        System.out.println("a va b ning ko'paytmasi: " + product);
//        System.out.println("a va b ning qismi: " + division)
//        scanner.close();
//    }
//}

//11
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        // Scanner obyekti orqali foydalanuvchidan a va b sonlarini olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan a va b sonlarini kiritishni so'rash
//        System.out.print("a sonini kiriting: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b sonini kiriting: ");
//        double b = scanner.nextDouble();
//
//        double sumOfAbs = Math.abs(a) + Math.abs(b);
//
//        double differenceOfAbs = Math.abs(a) - Math.abs(b);
//
//        double productOfAbs = Math.abs(a) * Math.abs(b);
//
//        double divisionOfAbs = Math.abs(a) / Math.abs(b);
//
//        System.out.println("a va b ning mutlaq qiymatlarining yig'indisi: " + sumOfAbs);
//        System.out.println("a va b ning mutlaq qiymatlarining ayirmasi: " + differenceOfAbs);
//        System.out.println("a va b ning mutlaq qiymatlarining ko'paytmasi: " + productOfAbs);
//        System.out.println("a va b ning mutlaq qiymatlarining qismi: " + divisionOfAbs);
//
//        scanner.close();
//    }
//}

//12

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("a oyoq uzunligini kiriting: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("b oyoq uzunligini kiriting: ");
//        double b = scanner.nextDouble();
//
//        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        double perimeter = a + b + c;
//
//        System.out.println("To'g'ri burchakli uchburchakning gipotenuzasi: " + c);
//        System.out.println("To'g'ri burchakli uchburchakning perimetri: " + perimeter);
//
//        scanner.close();
//    }
//}

//13

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Tashqi aylana radiusi R1: ");
//        double R1 = scanner.nextDouble();
//        System.out.print("Ichki aylana radiusi R2: ");
//        double R2 = scanner.nextDouble();
//
//        double pi = Math.PI;
//        double S1 = pi * R1 * R1;
//        double S2 = pi * R2 * R2;
//        double S3 = S1 - S2;
//        System.out.println("Tashqi aylananing maydoni S1: " + S1);
//        System.out.println("Ichki aylananing maydoni S2: " + S2);
//        System.out.println("Aylanalar bilan chegaralangan halqaning maydoni S3: " + S3);
//    }
//}


//14
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double L = scanner.nextDouble();
//        double pi = 3.14;
//
//        double R = L / (2 * pi);
//        double S = pi * R * R;
//
//        System.out.println( R + " " +S);
//
//        scanner.close();
//    }
//}

//15

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double S = scanner.nextDouble();
//        double pi = 3.14;
//
//        double D = Math.sqrt((4 * S) / pi);
//        double L = pi * D;
//
//        System.out.println( D + " " + L);
//
//        scanner.close();
//    }
//}

import java.util.Scanner;

////16
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//
//        double distance = Math.abs(x2 - x1);
//
//        System.out.println(distance);
//
//        scanner.close();
//    }
//}

//17
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//        double B = scanner.nextDouble();
//        double C = scanner.nextDouble();
//
//        double AC = Math.abs(C - A);
//        double BC = Math.abs(C - B);
//        double sum = AC + BC;
//
//        System.out.println( AC+ " "+ BC + " " +sum);
//
//        scanner.close();
//    }
//}


//18
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//        double B = scanner.nextDouble();
//        double C = scanner.nextDouble();
//
//        double AC = Math.abs(C - A);
//        double BC = Math.abs(B - C);
//        double product = AC * BC;
//
//        System.out.println(product);
//
//        scanner.close();
//    }
//}

//19

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//
//        double width = Math.abs(x2 - x1);
//        double height = Math.abs(y2 - y1);
//
//        double perimeter = 2 * (width + height);
//        double area = width * height;
//
//        System.out.println( perimeter + " " + area);
//
//        scanner.close();
//    }
//}

//20

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//
//        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//
//        System.out.println( distance);
//
//        scanner.close();
//    }
//}

//21
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//        double x3 = scanner.nextDouble();
//        double y3 = scanner.nextDouble();
//
//        // Uchburchak tomonlarini hisoblash
//        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
//        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
//
//        double p = (a + b + c) / 2;
//
//        //  Heron formulasi
//        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//
//        double perimeter = a + b + c;
//
//        System.out.println (perimeter+ " " +S);
//
//        scanner.close();
//    }
//}

//22
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//
//        int temp = A;
//        A = B;
//        B = temp;
//
//        System.out.println(A + " " + B);
//
//        scanner.close();
//    }
//}

//23
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//
//        int temp = A;
//        A = C;
//        C = B;
//        B = temp;
//
//        System.out.println(A + " " + B + " " + C);
//
//        scanner.close();
//    }
//}

//24
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//
//        int temp = A;
//        A = B;
//        B = C;
//        C = temp;
//
//        System.out.println(A + " " + B + " " + C);
//
//        scanner.close();
//    }
//}

//25
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//
//        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
//
//        System.out.println(y);
//
//        scanner.close();
//    }
//}

//26
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//
//        double y = 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;
//
//        System.out.println(y);
//
//        scanner.close();
//    }
//}


//27
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//
//        double A2 = A * A;  // A²
//        double A4 = A2 * A2; // A⁴
//        double A8 = A4 * A4; // A⁸
//
//        System.out.println(A2 + " " + A4 + " " + A8);
//
//        scanner.close();
//    }
//}

//28
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//
//        double A2 = A * A;      // A2
//        double A3 = A2 * A;     // A3
//        double A5 = A3 * A2;    // A5
//        double A10 = A5 * A5;   // A10
//        double A15 = A10 * A5;  // A15
//
//        System.out.println(A2 + " " + A3 + " " + A5 + " " + A10 + " " + A15);
//
//        scanner.close();
//    }
//}

//29
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double a = scanner.nextDouble();
//        double pi = 3.14;
//
//        double radian = (a * pi) / 180;
//
//        System.out.println(radian);
//
//        scanner.close();
//    }
//}
//30
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double a = scanner.nextDouble();
//        double pi = 3.14;
//
//        double degree = (a * 180) / pi;
//
//        System.out.println(degree);
//
//        scanner.close();
//    }
//}

//31

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double F = scanner.nextDouble();
//
//        double T = (5.0 / 9) * (F - 32);
//
//        System.out.println( T);
//
//        scanner.close();
//    }
//}


//32
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double T_C = scanner.nextDouble();
//
//        double T_F = (9.0 / 5) * T_C + 32;
//
//        System.out.println( T_F);
//
//        scanner.close();
//    }
//}


//33
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // X - kg shirinlik, A -  narxi, Y -  kg
//        double X = scanner.nextDouble();
//        double A = scanner.nextDouble();
//        double Y = scanner.nextDouble();
//
//        double P1 = A / X;
//        double PY = P1 * Y;
//
//        System.out.println(P1 + " " + PY);
//
//        scanner.close();
//    }
//}


//34

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // X - kg shokolad, A - shokolad narxi
//        // Y - kg shakar konfeti, B - shakar konfeti narxi
//        double X = scanner.nextDouble();
//        double A = scanner.nextDouble();
//        double Y = scanner.nextDouble();
//        double B = scanner.nextDouble();
//
//        double P_shokolad = A / X;
//        double P_konfet = B / Y;
//        double K = P_shokolad / P_konfet;
//
//        System.out.println( P_shokolad + " " + P_konfet + " " + K);
//
//        scanner.close();
//    }
//}

//35
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // V - qayiqning tezligi (km/soat)
//        // U - daryo oqimi tezligi (km/soat)
//        // T1 - ko'lda yurish vaqti (soat)
//        // T2 - daryoda oqimga qarshi yurish vaqti (soat)
//        double V = scanner.nextDouble();
//        double U = scanner.nextDouble();
//        double T1 = scanner.nextDouble();
//        double T2 = scanner.nextDouble();
//
//        double S1 = V * T1;
//        double S2 = (V - U) * T2;
//        double S = S1 + S2;
//
//        System.out.println( S);
//
//        scanner.close();
//    }
//}


//36
//
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double V1 = scanner.nextDouble();
//        double V2 = scanner.nextDouble();
//        double S = scanner.nextDouble();
//        double T = scanner.nextDouble();
//
//        double newDistance = S + (V1 + V2) * T;
//
//        System.out.println( newDistance);
//
//        scanner.close();
//    }
//}

//37
//    import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double V1 = scanner.nextDouble();
//        double V2 = scanner.nextDouble();
//        double S = scanner.nextDouble();
//        double T = scanner.nextDouble();
//
//        double newDistance = Math.abs(S - Math.abs(V1 - V2) * T);
//
//        System.out.println(newDistance);
//
//    }
//}

//38
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//        double B = scanner.nextDouble();
//
//        if (A != 0) {
//            double x = -B / A;
//            System.out.println( x);
//        } else {
//            System.out.println("A nolga teng bo‘lishi mumkin emas!");
//        }
//
//        scanner.close();
//    }
//}

//39
//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A = scanner.nextDouble();
//        double B = scanner.nextDouble();
//        double C = scanner.nextDouble();
//
//        double D = B * B - 4 * A * C;
//
//        if (D > 0 && A != 0) {
//            double sqrtD = Math.sqrt(D);
//            double x1 = (-B - sqrtD) / (2 * A);
//            double x2 = (-B + sqrtD) / (2 * A);
//
//            if (x1 > x2) {
//                double temp = x1;
//                x1 = x2;
//                x2 = temp;
//            }
//
//            System.out.println( x1 + " " + x2);
//        } else {
//            System.out.println("Noto‘g‘ri ma’lumotlar kiritildi!");
//        }
//
//        scanner.close();
//    }
//}

//40

//import java.util.Scanner;
//
//public class begin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double A1 = scanner.nextDouble();
//        double B1 = scanner.nextDouble();
//        double C1 = scanner.nextDouble();
//        double A2 = scanner.nextDouble();
//        double B2 = scanner.nextDouble();
//        double C2 = scanner.nextDouble();
//
//        double D = A1 * B2 - A2 * B1;
//
//        if (D != 0) {
//            double x = (C1 * B2 - C2 * B1) / D;
//            double y = (A1 * C2 - A2 * C1) / D;
//
//            System.out.println( x+ " " + y);
//        } else {
//            System.out.println("Tizimning yagona yechimi yo‘q!");
//        }
//
//        scanner.close();
//    }
//}
