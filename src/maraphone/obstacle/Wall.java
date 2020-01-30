package maraphone.obstacle;

import maraphone.ability.Abilities;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Abilities abilities) {
        abilities.jump(height);
    }
}
