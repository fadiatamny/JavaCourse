package app;
import app.Box.*;

public class App {
    public static void main(String[] args) throws Exception {
        Box b = new Box(10, 10, 10);
        Box.Fly f = b.new Fly();

        f.setX(6);
        f.setX(5);
        f.setX(7);
    }
}