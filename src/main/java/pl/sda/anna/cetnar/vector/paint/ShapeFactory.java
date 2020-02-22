package pl.sda.anna.cetnar.vector.paint;

import pl.sda.anna.cetnar.vector.paint.shapes.*;

public class ShapeFactory {
    public Shape get(String string) {
        String[] data = string.split(";");
        String shapeName = data[0].toLowerCase();
        switch (shapeName){
            case "line":
                return getLine(data);
            case "triangle":
                return getTriangle(data);
            case "rectangle":
                return getRectangle(data);
            case "ellipse":
                return getEllipse(data);
            case "circle":
                return getCircle(data);
            case "star":
                return getStar(data);
        }
        return null;
    }

    private Shape getLine(String [] data) {
        //Line:341.7282121959948;106.49350417727939;466.83900273157315;275.32467719052494;0xf5f5dcff;0x000000ff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Line.Builder builder = new Line.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getRectangle(String [] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Rectangle.Builder builder = new Rectangle.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getTriangle(String [] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        double x3 = Double.parseDouble(data[5]);
        double y3 = Double.parseDouble(data[6]);
        String fillColor = data[7];
        String strokeColor = data[8];

        Triangle.Builder builder = new Triangle.Builder()
                .setPoint1(x1,y1)
                .setPoint2(x2,y2)
                .setPoint3(x3,y3)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getEllipse(String [] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Ellipse.Builder builder = new Ellipse.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getCircle(String [] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Circle.Builder builder = new Circle.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }

    private Shape getStar(String [] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];

        Star.Builder builder = new Star.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);

        return builder.build();
    }
}
