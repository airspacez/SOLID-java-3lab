public class Human<T> extends Unit<T> {

    public Human() {
        super();
    }

    public Human(T id, String name, int health, int damage, int speed) {
        super(id, name, health, damage, speed);
    }

    @Override
    public void MoveUp() {
        y += speed;
    }

    @Override
    public void MoveDown() {
        y -= speed;
    }

    @Override
    public void MoveRight() {
        x += speed;

    }

    @Override
    public void MoveLeft() {
        x -= speed;
    }

    @Override
    public void pickUpArtifact() {
        health += 10;
        damage += 10;
    }

}
