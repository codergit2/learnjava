package Organes;

import Body.Organe;

public class skin extends Organe {
    public skin(String name, String State) {
        super(name, State);
    }

    public void showState(){System.out.println("Skin is "+this.getState());}
}
