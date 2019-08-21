package Singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    //private static final long serialVersionUID = 6085237886067446069L;

    private int hp = 100;
    private String characterName="";

    private static GameEngine instance = new GameEngine();


    private GameEngine() {

    }

    public void run(){ //
        while(true){



        }
    }

    public static GameEngine getInstance(){
        if (instance==null){

            synchronized(GameEngine.class) {

                if (instance==null) {
                    instance = new GameEngine();
                }
            }
        }

        return instance;
    }


    protected Object readResolve(){
        return getInstance();
    }
}
