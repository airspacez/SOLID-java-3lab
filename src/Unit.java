public abstract class Unit extends GameObject implements Interaction {
    // Имя юнита
    private String name;

    // Характеристики юнита
    protected int health;
    protected int damage;
    protected int speed;

    public Unit() {
        super();
        health = 10;
        damage = 0;
        speed = 1;
    }

    public Unit(String name, int health, int damage, int speed) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}