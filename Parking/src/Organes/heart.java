package Organes;

import Body.Organe;

public class heart extends Organe {
    public heart(String name, int rate) {
        super(name, rate);
    }

    public void showState() {System.out.println("Heart is beating at "+this.getRate()+" rate.");}
}
