package maraphone;

import maraphone.ability.Abilities;
import maraphone.ability.Cat;
import maraphone.ability.Person;
import maraphone.ability.Robot;
import maraphone.obstacle.Obstacle;
import maraphone.obstacle.Treadmill;
import maraphone.obstacle.Wall;

public class Main {
    public static void main(String[] args){
        Abilities[] abilities ={
                new Person("Vasya"),
                new Cat("Bob"),
                new Robot("GT-501")
        };
        Obstacle[] obstacles ={
                new Treadmill(500),
                new Wall(6)
        };
        for (Abilities a:abilities) {
            for (Obstacle o:obstacles) {
                o.doIt(a);
                if(!a.isDistance()){
                    break;
                }

            }
            
        }

        for (Abilities a:abilities) {
            a.info();
            
        }
    }
}
