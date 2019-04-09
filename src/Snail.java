import java.util.Scanner;

public class Snail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        System.out.println(((V-A-1)/(A-B)+1)+1);
    }
}