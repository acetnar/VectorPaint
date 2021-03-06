package pl.sda.anna.cetnar.vector.paint.shapes;

import com.sun.org.glassfish.gmbal.ManagedAttribute;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

    private double xc;
    private double yc;
    private double r;


    public Circle(double x1, double y1, double x2, double y2) {
        xc = (x1 + x2) / 2;
        yc = (y1 + y2) / 2;
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        double d = Math.min(width,height);
        r = d/2;
    }

    private Circle(Builder builder) {
        this.xc = builder.x1;
        this.yc = builder.y1;
        this.r = builder.x2;
        setFillColor(builder.fillColor);
        setStrokeColor(builder.strokeColor);
    }

    public void draw(GraphicsContext context) {
        double x = xc - r;
        double y = yc - r;
        double size = 2*r;
        context.strokeOval(x,y,size,size);
        context.fillOval(x,y,size,size);

    }

    @Override
    public String getData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle;");
        builder.append(xc).append(";");
        builder.append(yc).append(";");
        builder.append(r).append(";");
        builder.append(getFillColor()).append(";");
        builder.append(getStrokeColor()).append(";");
        return builder.toString();
    }


    public static class Builder {
        double x1;
        double y1;
        double x2;
        double y2;
        Color fillColor = Color.RED;
        Color strokeColor = Color.RED;

        public Circle build() {
            return new Circle(this);
        }

        public Circle.Builder setX1(double x1) {
            this.x1 = x1;
            return this;
        }

        public Circle.Builder setY1(double y1) {
            this.y1 = y1;
            return this;
        }

        public Circle.Builder setX2(double x2) {
            this.x2 = x2;
            return this;
        }

        public Circle.Builder setY2(double y2) {
            this.y2 = y2;
            return this;
        }

        public Circle.Builder setFillColor(String fillColor) {
            this.fillColor = Color.valueOf(fillColor);
            return this;
        }

        public Circle.Builder setStrokeColor(String strokeColor) {
            this.strokeColor = Color.valueOf(strokeColor);
            return this;
        }
    }
}
