import java.util.Scanner;

public class P_Sae {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[2]);
        tekitou(a, line[1], b);
    }


    public static void tekitou(int a,String p,int b) {
        int result;
        if (p.equals("+")) {
            result = a + b;
        } else {
            result = a - b;
        }
        System.out.println(result);
    }
}
