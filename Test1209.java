//import java.util.Scanner;
//
//public class Test1209 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int input=sc.nextInt();
//        if(input<=18) {
//            System.out.println("少年");
//        }
//        if ((input>18)&&(input<=28)) {
//            System.out.println("青年");
//        }
//        if ((input>28)&&(input<=55)) {
//            System.out.println("中年");
//        }
//        if (input>55) {
//            System.out.println("老年");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Test1209 {
//    public static void main(String[] args) {
//        int i;
//        Scanner sc=new Scanner(System.in);
//        int input=sc.nextInt();
//        for (i = 2; i < input; i++) {
//            if (input % i == 0)
//                break;
//        }
//        if (input == i) {
//            System.out.println("素数:" + input);
//        }
//    }
//}
//
public class Test1209 {
    public static void main(String[] args) {
        int n;
        int i;
        for (n = 2; n <= 100; n++) {
            for(i = 2;i <= n;i++) {
            if (n%i==0)
            break;
            }
            if (n==i) {
                System.out.println("素数:"+n);
            }
        }
    }
}
//
//public class Test1209 {
//    public static void main(String[] args) {
//        int n;
//        int coust = 0;
//        for (n = 1; n <= 100; n++) {
//            if ((n / 10 == 9)||(n % 10==9)) {
//                coust++;
//            }
//        }
//        System.out.println(coust);
//    }
//}
