package shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}