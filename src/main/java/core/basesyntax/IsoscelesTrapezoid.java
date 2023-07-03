package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int height;
    private final int firstSide;
    private final int secondSide;

    public IsoscelesTrapezoid(Color color, int height, int firstSide, int secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure : IsoscelesTrapezoid ; area : " + getArea()
                + " first side : " + firstSide
                + " second side : " + secondSide
                + " height : " + height
                + " color : " + getColor());
    }

    @Override
    public double getArea() {
        return (double) ((firstSide + secondSide) * height) / 2;
    }
}