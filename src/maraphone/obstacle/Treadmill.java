package maraphone.obstacle;

import maraphone.ability.Abilities;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length){
        this.length = length;
    }

    @Override
    public void doIt(Abilities abilities) {
        abilities.run(length);
    }
}
