import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }

    public void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast dit navn: ");
        String name = sc.nextLine();
        System.out.println("Hej " + name + "!");
    }
}
