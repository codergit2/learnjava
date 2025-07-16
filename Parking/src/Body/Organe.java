package Body;

public class Organe {
    private String name;
    private String State;
    private int rate;

    public Organe(String name, String State) {
        this.name = name;
        this.State = State;

    }

    public Organe(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void showState(){System.out.println("Organe at his first state");}

    public void changeState(){System.out.println("Organe at his second state");}
}
