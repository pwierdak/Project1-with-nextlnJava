import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("Go home, you cannot enter!" +name +surname);
        }else {
            System.out.println("You can enter! Have fun!" +name +surname);
        }
    }
}