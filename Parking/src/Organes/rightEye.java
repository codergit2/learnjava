package Organes;

import Body.Organe;

public class rightEye extends Organe {
    public rightEye(String name, String State) {
        super(name, State);
    }

    public void showState(){System.out.println("rightEye is "+this.getState());}

    public void changeState(){System.out.println("rightEye is "+this.getState());}
}
