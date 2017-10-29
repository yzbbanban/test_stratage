package ja.impl;

import ja.StratageFly;

public class FlyNoWay implements StratageFly {
    @Override
    public void performFly() {
        System.out.println("不会飞");
    }
}
