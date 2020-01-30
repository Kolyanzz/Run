package maraphone.ability;
public class Cat implements Abilities {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeigth;

    boolean onDistance;

    public Cat( String name, int maxRunDistance, int maxJumpHeigth) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name,300,10);

    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " провалил тест на бег");
            onDistance = false;
        }
    }

    @Override
    public void jump(int heigth) {
        if (heigth <= maxJumpHeigth) {
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " провалил тест на прыжок");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println( name + " "+ onDistance);
    }
}
