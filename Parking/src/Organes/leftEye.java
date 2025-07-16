package Organes;

import Body.Organe;

public class leftEye extends Organe {
    public leftEye(String name, String State) {
        super(name, State);
    }

    public void showState(){System.out.println("leftEye is "+this.getState());}

    public void changeState(){System.out.println("leftEye is "+this.getState());}
}
