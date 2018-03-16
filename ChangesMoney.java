import java.util.Scanner;

public class ChangesMoney {
    public static void main(String[] args) {
        long vnd,usd;
        long rate=23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số tiền USD:");
        usd=scanner.nextLong();
        vnd=usd*rate;
        System.out.println("Số tiền VND:"+vnd);

    }
}
