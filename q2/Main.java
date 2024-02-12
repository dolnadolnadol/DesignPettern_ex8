import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        LiveScore liveSc = new LiveScore();
        liveSc.add(sub1);
        liveSc.add(sub2);

        Scanner sc = new Scanner(System.in);
        String result = "";
        while(true) {
            System.out.print("Enter score: ");
            result = sc.nextLine();

            if(result.equals("")) break;

            liveSc.setResult(result);
        }
        sc.close();
    }
}