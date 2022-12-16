import java.util.Scanner;

public class TinkTask3 {
    public static int getNok(int a, int b) {
        int a1=a;
        int b1=b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return (a1*b1)/a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        sc.close();
        int nokMin = Integer.MAX_VALUE;
        int ares=0;
        int bres=0;

        for (int i=1;i<num;i++){
            int a = i;
            int b = num-i;
            int nok = getNok(a,b);
            if (nok<nokMin){
                nokMin = nok;
                ares = a;
                bres = b;
            }
        }

        System.out.println(ares+" "+bres);

    }
}
