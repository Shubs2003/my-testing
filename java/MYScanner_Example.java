import java.util.*;
public class MYScanner_Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.next();
        System.out.println("Enter your phone number");
        int phone = sc.nextInt(10);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Your phone number is " + phone);
        System.out.println("Your age is " + age);
        System.out.println("Your address" + address);

        sc.close();

}
}