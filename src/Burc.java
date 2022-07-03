import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.println(" Dogdugunuz Ay: ");
        month= input.nextInt();

        System.out.println(" Dogdunuz Gun: ");
        day = input.nextInt();


         if(month == 1 ) {
             if ((day >=1) && (day <=30)){
             if (day <= 21) {
                 System.out.println(" Burcunuz Oglaktir.");
             }else {
                 System.out.println(" Burcunuz Kova'dir.");
             }
         } else {
                 System.out.println(" Hatali bir islem yaptiniz!!");
             }

    }
        if(month == 2 ) {
            if ((day >=1) && (day <=28)){
                if (day <= 19) {
                    System.out.println(" Burcunuz Kova'dir.");
                }else {
                    System.out.println(" Burcunuz Balik'tir.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }
        if(month == 3 ) {
            if ((day >=1) && (day <=31)){
                if (day <= 20) {
                    System.out.println(" Burcunuz Balik'tir.");
                }else {
                    System.out.println(" Burcunuz Koç'tur.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }
        if(month == 4 ) {
            if ((day >=1) && (day <=30)){
                if (day <= 20) {
                    System.out.println(" Burcunuz Koç'tur.");
                }else {
                    System.out.println(" Burcunuz Boga'dir.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }
        if(month == 5 ) {
            if ((day >=1) && (day <=31)){
                if (day <= 22) {
                    System.out.println(" Burcunuz Boga'dir.");
                }else {
                    System.out.println(" Burcunuz Ikizler'dir.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }
        if(month == 6 ) {
            if ((day >=1) && (day <=30)){
                if (day <= 23) {
                    System.out.println(" Burcunuz Ikizler.");
                }else {
                    System.out.println(" Burcunuz Yengec'tir.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }
        if(month == 7 ) {
            if ((day >=1) && (day <=31)){
                if (day <= 22) {
                    System.out.println(" Burcunuz Yengec'tir.");
                }else {
                    System.out.println(" Burcunuz Aslan'dir.");
                }
            } else {
                System.out.println(" Hatali bir islem yaptiniz!!");
            }

        }


        }
}

