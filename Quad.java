package shapes;


public class Quad extends Shape {
    private double sideLength;

    public Quad(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Quad";
    }
}

