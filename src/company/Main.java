package company;

public class Main {
    public static void main(String[] args){
        Person bobby = new Person();
        System.out.println(bobby.toString());

        Person nick = new Person(50000, "Pilot");
        System.out.println(nick.toString());
    }
}
