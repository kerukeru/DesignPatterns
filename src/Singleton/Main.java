package Singleton;

public class Main {

    public static void main(String[] args) {

        GameEngine ge = GameEngine.getInstance();

        GameEngine ge2 = GameEngine.getInstance();


        System.out.println(ge==ge2);//



    }
}
