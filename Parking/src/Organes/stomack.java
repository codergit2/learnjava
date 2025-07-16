package Organes;

import Body.Organe;

public class stomack extends Organe {
    public stomack(String name, String State) {
        super(name, State);
    }

    public void showState() {System.out.println("Stomack is "+this.getState());}

    public void changeState() {System.out.println("Stomack is "+this.getState());}
}
