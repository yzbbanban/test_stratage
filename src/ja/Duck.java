package ja;

public abstract class Duck {
    private StratageFly stratageFly;

    public StratageFly getStratageFly() {
        return stratageFly;
    }

    public void setStratageFly(StratageFly stratageFly) {
        this.stratageFly = stratageFly;
    }
    public void fly(){
        stratageFly.performFly();
    }

    protected void shout(){

    }
    protected abstract void appearance();
}
