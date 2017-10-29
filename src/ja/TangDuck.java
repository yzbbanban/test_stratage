package ja;

import ja.impl.FlyNoWay;

public class TangDuck extends Duck {
    public TangDuck() {
        super();
        super.setStratageFly(new FlyNoWay());
    }

    @Override
    protected void appearance() {
        System.out.println("唐老鸭");
    }

    @Override
    protected void shout() {

        System.out.println("哇哇哇");
    }

}
