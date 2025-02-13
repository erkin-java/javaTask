//    import java.util.Scanner;
//
//    public class bool {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("A sonini kiriting: ");
//            int A = scanner.nextInt();
//
//            if (A > 0) {
//                System.out.println("Taklif to'g'ri: A soni musbat.");
//            } else {
//                System.out.println("Taklif noto'g'ri: A soni musbat emas.");
//            }
//
//            scanner.close();
//        }
//    }

//2

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        if (A % 2 == 1) {
//            System.out.println("Taklif to'g'ri: A soni toq.");
//        } else {
//            System.out.println("Taklif noto'g'ri: A soni toq emas.");
//        }
//
//        scanner.close();
//    }
//}


//3
/*
import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sonini kiriting: ");
        int A = scanner.nextInt();

        if (A % 2 == 0) {
            System.out.println("Taklif to'g'ri: A soni juft.");
        } else {
            System.out.println("Taklif noto'g'ri: A soni juft emas.");
        }

        scanner.close();
    }
}*/

//4
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if (A > 2 && B <= 3) {
//            System.out.println("Taklif to'g'ri: A > 2 va B ≤ 3 tengsizliklari ikkalasi ham bajarilgan.");
//        } else {
//            System.out.println("Taklif noto'g'ri: A > 2 va B ≤ 3 tengsizliklaridan kamida biri bajarilmagan.");
//        }
//
//        scanner.close();
//    }
//}

//5
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if (A >= 0 || B < -2) {
//            System.out.println(" A ≥ 0 yoki B < −2 tengsizliklardan kamida biri bajarilgan.");
//        } else {
//            System.out.println(" A ≥ 0 yoki B < −2 tengsizliklaridan hech biri bajarilmagan.");
//        }
//
//        scanner.close();
//    }
//}

//6

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A < B && B< C) {
//            System.out.println(" A < B < C tengsizliklardan kamida biri bajarilgan.");
//        } else {
//            System.out.println(" A < B < C tengsizliklaridan hech biri bajarilmagan.");
//        }
//
//        scanner.close();
//    }
//}
//7

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if ((A < B && B < C) || (C < B && B < A)) {
//            System.out.println(" B soni A va  C o'rtasida tengsizliklardan kamida biri bajarilgan.");
//        } else {
//            System.out.println(" B soni A va  C o'rtasida tengsizliklaridan hech biri bajarilmagan.");
//        }
//
//        scanner.close();
//    }
//}

//8
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if (A % 2 == 1  && B % 2 == 1) {
//            System.out.println("toq");
//        } else {
//            System.out.println("toq emas.");
//        }
//
//        scanner.close();
//    }
//}


//9

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if (A % 2 == 1  || B % 2 == 1) {
//            System.out.println("toq");
//        } else {
//            System.out.println("toq emas.");
//        }
//
//        scanner.close();
//    }
//}

//10

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if ((A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0)) {
//            System.out.println("kamida bittasi toq");
//        } else {
//            System.out.println("toq emas.");
//        }
//
//        scanner.close();
//    }
//}

//11
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        if (A % 2 == B % 2) {
//            System.out.println("Taklif to'g'ri: A va B raqamlari teng paritetga ega.");
//        } else {
//            System.out.println("Taklif noto'g'ri: A va B raqamlari teng paritetga ega emas.");
//        }
//
//        scanner.close();
//    }
//}

//12
//
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A > 0 && B > 0 && C > 0) {
//            System.out.println(" musbat");
//        } else {
//            System.out.println("musbat emas");
//        }
//
//        scanner.close();
//    }
//}

//13

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A > 0 ||  B > 0 ||  C > 0) {
//            System.out.println(" musbat");
//        } else {
//            System.out.println("musbat emas");
//        }
//
//        scanner.close();
//    }
//}

//14

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if ((A > 0  &&  B < 0) ||(  B> 0 &&  C < 0)  || (C > 0 && A < 0 ) ){
//            System.out.println(" aynan bittasi musbat");
//        } else {
//            System.out.println("musbat emas");
//        }
//
//        scanner.close();
//    }
//}

//15
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        int musbat = 0;
//
//        if (A > 0) musbat++;
//        if (B > 0) musbat++;
//        if (C > 0) musbat++;
//
//        if (musbat == 2) {
//            System.out.println("Taklif to'g'ri: A, B, va C raqamlaridan aynan ikkitasi musbat.");
//        } else {
//            System.out.println("Taklif noto'g'ri: A, B, va C raqamlaridan aynan ikkitasi musbat emas.");
//        }
//
//        scanner.close();
//    }
//}


//16

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Musbat butun sonni kiriting: ");
//        int N = scanner.nextInt();
//
//        if (N >= 10 && N <= 99 && N % 2 == 0) {
//            System.out.println("Taklif to'g'ri: Son ikki xonali juft sondir.");
//        } else {
//            System.out.println("Taklif noto'g'ri: Son ikki xonali juft son emas.");
//        }
//
//        scanner.close();
//    }
//}


//17

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Musbat butun sonni kiriting: ");
//        int N = scanner.nextInt();
//
//        if (N >= 100 && N <= 999 && N % 2 == 1) {
//            System.out.println("Taklif to'g'ri: Son uch xonali toq sondir.");
//        } else {
//            System.out.println("Taklif noto'g'ri: Son uch xonali toq son emas.");
//        }
//
//        scanner.close();
//    }
//}

//18

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A == B || A == C || B == C) {
//            System.out.println("Taklif to'g'ri: Uchta berilgan sonlar orasida kamida bir juft teng bor.");
//        } else {
//            System.out.println("Taklif noto'g'ri: Uchta berilgan sonlar orasida teng juft yo'q.");
//        }
//
//        scanner.close();
//    }
//}

//19

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A != B || A != C || B != C) {
//            System.out.println("Taklif to'g'ri: Uchta berilgan sonlar orasida kamida bir juft qarama qarshilik  bor.");
//        } else {
//            System.out.println("Taklif noto'g'ri: Uchta berilgan sonlar orasida  bir juft qarama qarshilik yo'q.");
//        }
//
//        scanner.close();
//    }
//}

//20
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A != B && A != C && B != C) {
//            System.out.println("Raqamning barcha raqamlari boshqacha");
//        } else {
//            System.out.println("Raqamning barcha raqamlari boshqacha emas ");
//        }
//
//        scanner.close();
//    }
//}

//21
//
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if (A < B && A < C && B < C) {
//            System.out.println("Raqamning barcha raqamlari o'sish tartibida");
//        } else {
//            System.out.println("Raqamning barcha raqamlari o'sish tartibida emas ");
//        }
//
//        scanner.close();
//    }
//}

//22
//
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        if ((A < B && A < C && B < C) || (A > B && A > C && B > C)) {
//            System.out.println("Raqamning barcha raqamlari o'sish yoki kamayish tartibida");
//        } else {
//            System.out.println("Raqamning barcha raqamlari o'sish yoki kamayish tartibida emas ");
//        }
//
//        scanner.close();
//    }
//}

//23

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting: ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        System.out.print("C sonini kiriting: ");
//        int C = scanner.nextInt();
//
//        System.out.print("D sonini kiriting: ");
//        int D = scanner.nextInt();
//
//        if (A == D  && B ==  C  ) {
//            System.out.println("Raqam chapdan o'ngga ham, o'ngdan chapga ham teng o'qiladi");
//        } else {
//            System.out.println("Raqam chapdan o'ngga ham, o'ngdan chapga ham teng o'qilmaydi ");
//        }
//
//        scanner.close();
//    }
//}


//24

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//
//        if (x < 0 && y > 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//25
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//
//        if (x > 0 && y < 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//26
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//
//        if (x < 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//27

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//
//        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}
//28
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//
//        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}


//29

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double x = scanner.nextDouble();
//        double y = scanner.nextDouble();
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//
//        if (x1 < x && x < x2 && y2 < y && y < y1) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}


//30
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if ((a == b) || (b == c) || (a == c)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//31
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//32


//33

//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a + b > c && a + c > b && b + c > a) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        scanner.close();
//    }
//}

//34
//
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        if ((x + y) % 2 == 0) {
//            System.out.println("YES"); // Oq rang
//        } else {
//            System.out.println("NO");  // Qora rang
//        }
//
//        scanner.close();
//    }
//}

//35


//36
//import java.util.Scanner;
//
//public class bool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read input coordinates
//        System.out.print("Enter x1, y1, x2, y2: ");
//        int x1 = scanner.nextInt();
//        int y1 = scanner.nextInt();
//        int x2 = scanner.nextInt();
//        int y2 = scanner.nextInt();
//
//        boolean result = (x1 != x2 && y1 == y2) || (y1 != y2 && x1 == x2);
//
//
//        if (result) {
//            System.out.println("HA");
//        } else {
//            System.out.println("YO'Q");
//        }
//    }
//
//}
