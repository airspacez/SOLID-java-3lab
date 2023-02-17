public class Surface {
    // Размерность карты
    private int x;
    private int y;

    public Surface() {
        this.x = 50;
        this.y = 50;
    }

    public Surface(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
