public class Human extends Unit {

    public Human() {
        super();
    }

    public Human(String name, int health, int damage, int speed) {
        super(name, damage, damage, speed);
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
