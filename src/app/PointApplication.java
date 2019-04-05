package app;

import controller.PiontController;
import data.Point;

public class PointApplication {
    private static final int ADD_X = 0;
    private static final int MINUS_X = 1;
    private static final int ADD_Y = 2;
    private static final int MINUS_Y = 3;

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PiontController pc = new PiontController();
        System.out.println("punkt przed zmianą: (" + p1.getX() + ";" + p1.getY() + ")");

        int wybór = ADD_X;
        switch (wybór) {
            case ADD_X:
                pc.addX(p1);
                break;
            case MINUS_X:
                pc.minusX(p1);
                break;
            case ADD_Y:
                pc.addY(p1);
                break;
            case MINUS_Y:
                pc.minusY(p1);
                break;
            default:
                System.out.println("błędny wybór");

        }

        System.out.println("punkt po zmianie (" + p1.getX() + ";" + p1.getY() + ")");

    }
}
