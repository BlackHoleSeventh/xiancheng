public class Main {

    public static void main(String[] args) {
        ex e=new ex();
        e.start();
        System.out.println("---");
        im i=new im();
        Thread t=new Thread(i);
        t.start();
    }
}
