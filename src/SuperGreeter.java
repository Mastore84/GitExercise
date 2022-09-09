import java.util.Scanner;

public class SuperGreeter {
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("Det virker!");
    }

    public void greet(){
        System.out.print("Indtast dit navn: ");
        String name = sc.nextLine();
        System.out.println("Hej " + name + "!");
    }

    public int askAboutAge(){
        System.out.print("Indtast din alder: ");
        return sc.nextInt();
    }
}
