public class Main {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        System.out.println(sg.askAboutAge());

    }
}
