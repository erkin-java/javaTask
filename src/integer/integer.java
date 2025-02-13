//1
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masofani santimetrda kiriting: ");
//        int L = scanner.nextInt();
//
//        int Meters = L / 100;
//
//        System.out.println("Masofaning to'liq metrlari: " + Meters);
//
//        scanner.close();
//    }
//}

//2
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print(" kg kiriting: ");
//        int m = scanner.nextInt();
//
//        int tonna = m / 1000;
//
//        System.out.println(tonna + "tonna ");
//
//        scanner.close();
//    }
//}

//3
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("bayt: ");
//        int k = scanner.nextInt();
//
//        int kb = k / 1024;
//
//        System.out.println("kilobayt: " + kb);
//
//        scanner.close();
//    }
//}

//4

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting (A > B): ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        int numberOfSegments = A / B;
//
//        System.out.println("A segmentiga joylashtirilgan B segmentlarining soni: " + numberOfSegments);
//
//        scanner.close();
//    }
//}
//5
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("A sonini kiriting (A > B): ");
//        int A = scanner.nextInt();
//
//        System.out.print("B sonini kiriting: ");
//        int B = scanner.nextInt();
//
//        int unused = A % B;
//
//        System.out.println("A segmentining foydalanilmagan qismi uzunligi: " + unused);
//
//        scanner.close();
//    }
//}

//6
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ikki xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int tensPlace = number / 10;
//
//        int onesPlace = number % 10;
//
//        System.out.println("O'nlik raqam: " + tensPlace);
//        System.out.println("Birlik raqam: " + onesPlace);
//
//        scanner.close();
//    }
//}

//8

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ikki xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int tensPlace = number / 10;
//
//        int onesPlace = number % 10;
//
//        int swappedNumber = (onesPlace * 10) + tensPlace;
//
//        System.out.println("Raqamlarni almashtirgan holda yangi son: " + swappedNumber);
//
//        scanner.close();
//    }
//}


//7

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ikki xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int tensPlace = number / 10;
//
//        int onesPlace = number % 10;
//
//        int yigindi = onesPlace + tensPlace;
//
//        int kopaytma = onesPlace * tensPlace;
//
//
//        System.out.println("yigindisi: " + yigindi);
//        System.out.println("kopaytma: " + kopaytma);
//
//        scanner.close();
//    }
//}

//9
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int hundred = number / 100;
//
//        System.out.println("Yuzlik raqam: " + hundred);
//
//        scanner.close();
//    }
//}


//10
//
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int ten  = (number / 10) %10;
//        int one = number  % 10;
//
//        System.out.println("onlik raqam: " + ten);
//        System.out.println("birlik raqam: " + one);
//
//        scanner.close();
//    }
//}

//11
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//
//        int ten = (number / 10) % 10;
//
//        int hundred = number /100;
//
//        int yigindi = one + ten + hundred;
//        int kopaytma = one * ten * hundred;
//
//
//        System.out.println("yigindi: " + yigindi);
//        System.out.println("kopaytmasi: " + kopaytma);
//
//        scanner.close();
//    }
//}

//12
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//        int tens = (number / 10) % 10;
//        int hundred = number / 100;
//
//        int reversedNumber = (one* 100) + (tens * 10) + hundred;
//
//        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);
//
//        scanner.close();
//    }
//}


//13
//
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//        int ten = (number / 10) % 10;
//        int hundred = number / 100;
//
//        int reversedNumber = (ten * 100) + (one * 10) + hundred;
//
//        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);
//
//        scanner.close();
//    }
//}

//14


//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//        int ten = (number / 10) % 10;
//        int hundred = number / 100;
//
//        int reversedNumber = (one * 100) + (hundred * 10) + ten;
//
//        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);
//
//        scanner.close();
//    }
//}

//15
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//        int ten = (number / 10) % 10;
//        int hundred = number / 100;
//
//        int reversedNumber = (ten * 100) + (one * 10) + hundred;
//
//        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);
//
//        scanner.close();
//    }
//}

//16
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        // Scanner obyekti yordamida foydalanuvchidan uch xonali sonni olish
//        Scanner scanner = new Scanner(System.in);
//
//        // Foydalanuvchidan uch xonali sonni kiritishni so'rash
//        System.out.print("Uch xonali butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int one = number % 10;
//        int ten = (number / 10) % 10;
//        int hundred = number / 100;
//
//        int reversedNumber = (hundred * 100) + (one * 10) + ten;
//
//        System.out.println("Berilgan sonning o'ngdan chapga o'qilgan shakli: " + reversedNumber);
//
//        scanner.close();
//    }
//}

//17
//
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int hundredsPlace = (number / 100) % 10;
//
//        System.out.println("Berilgan sonning yuzlik raqami: " + hundredsPlace);
//
//        scanner.close();
//    }
//}

//18


//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("butun sonni kiriting: ");
//        int number = scanner.nextInt();
//
//        int ming = (number / 1000) % 10;
//
//        System.out.println("Berilgan sonning minglik raqami: " + ming);
//
//        scanner.close();
//    }
//}


//19

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Kun boshidan o'tgan soniyalarni kiriting: ");
//        int seconds = scanner.nextInt();
//
//        int fullMinutes = seconds / 60;
//
//        System.out.println("Kun boshidan o'tgan to'liq daqiqalar miqdori: " + fullMinutes);
//
//        scanner.close();
//    }
//}

//20
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
//        int s = scanner.nextInt();
//
//        int soat = s / 3600;
//
//        System.out.println("Kun boshidan o'tgan to'liq soatlar miqdori: " + soat);
//
//        scanner.close();
//    }
//}
//21

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
//        int s = scanner.nextInt();
//
//        int soat = s % 60 ;
//
//
//        System.out.println("Kun boshidan o'tgan minutning to'liq soniya  miqdori: " + soat);
//
//        scanner.close();
//    }
//}

//22
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
//        int s = scanner.nextInt();
//
//        int soat = s % 3600 ;
//
//
//        System.out.println("Kun boshidan o'tgan soatning to'liq soniya  miqdori: " + soat);
//
//        scanner.close();
//    }
//}

//23

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Kun boshidan o'tgan soniya kiriting: ");
//        int s = scanner.nextInt();
//
//        int soat = s % 3600 ;
//        int min = soat / 60;
//
//        System.out.println("Kun boshidan o'tgan soatning to'liq minuti  miqdori: " + soat);
//
//        scanner.close();
//    }
//}
//24
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Yilning K-kunini kiriting (1-365): ");
//        int K = scanner.nextInt();
//
//
//        int weekDay = (K + 1) % 7;
//
//        System.out.println("Yilning " + K + "-kuni: " + weekDay);
//
//        scanner.close();
//    }
//}

//25
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//
//        int weekDay = (K + 4 - 1) % 7;
//        System.out.println(weekDay);
//        scanner.close();
//    }
//}

//26

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//        int startingDay = 2;
//        int weekDay = ((K + startingDay - 2) % 7) + 1;
//        System.out.println(weekDay);
//        scanner.close();
//    }
//}
//27
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//        int startingDay = 6;  //shanba
//        int weekDay = ((K + startingDay - 2) % 7) + 1;
//        System.out.println(weekDay);
//        scanner.close();
//    }
//}

//28

//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int K = scanner.nextInt();
//        int N = scanner.nextInt();
//        int weekDay = ((K + N - 2) % 7) + 1;
//        System.out.println(weekDay);
//        scanner.close();
//    }
//}

//29
//import java.util.Scanner;
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("To'rtburchakning A uzunligi: ");
//        int A = scanner.nextInt();
//        System.out.print("To'rtburchakning B uzunligi: ");
//        int B = scanner.nextInt();
//        System.out.print("Kvadratning yon uzunligi (C): ");
//        int C = scanner.nextInt();
//
//        int numSquares = (A / C) * (B / C);
//        int unusedArea = (A * B) - (numSquares * C * C);
//        System.out.println("To'rtburchak ustiga joylashtirilgan kvadratlar soni: " + numSquares);
//        System.out.println("Foydalanilmagan maydon: " + unusedArea);
//    }
//}


//30
//import java.util.Scanner;
//
//public class integer {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        int century = (year - 1) / 100 + 1;
//        System.out.println(century);
//        scanner.close();
//    }
//}
