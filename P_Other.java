import java.util.Scanner;

public class P_Other {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        Michiru(line);
        Michiru_other(line);
        Yurie();
    }
    public static void Michiru(String line) {
        String result = "";
        if (line.contains("help")) {
            result = "SOS";
        } else {
            result = line;
        }
        System.out.println(result);
    }


    public static void Michiru_other(String line) {
        String result = line.contains("help") ? "SOS" : line;
        System.out.println(result);
    }

    public static void Yurie() {
        int result = 0;
        Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String s = in.next();
                int num = Integer.parseInt(s);
                result += num;
            }
        System.out.println(result);
    }
}