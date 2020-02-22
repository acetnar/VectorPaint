package pl.sda.anna.cetnar.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {

    private double x;
    private double y;
    private double w;
    private double h;

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x = Math.min(x1,x2);
        this.y = Math.min(y1,y2);
        this.w = Math.abs(x1-x2);
        this.h = Math.abs(y1-y2);
    }

    private Rectangle(Builder builder){
        this.x = builder.x1;
        this.y = builder.y1;
        this.w = builder.x2;
        this.h = builder.y2;
        setFillColor(builder.fillColor);
        setStrokeColor(builder.strokeColor);
    }
    public void draw(GraphicsContext context) {
        context.strokeRect(x,y,w,h);
        context.fillRect(x,y,w,h);

    }

    @Override
    public String getData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rectangle;");
        builder.append(x).append(";");
        builder.append(y).append(";");
        builder.append(w).append(";");
        builder.append(h).append(";");
        builder.append(getFillColor()).append(";");
        builder.append(getStrokeColor()).append(";");
        return builder.toString();
    }


    public static class Builder{
        double x1;
        double y1;
        double x2;
        double y2;
        Color fillColor = Color.RED;
        Color strokeColor = Color.RED;

        public Rectangle build(){
            return new Rectangle(this);
        }

        public Rectangle.Builder setX1(double x1) {
            this.x1 = x1;
            return this;
        }

        public Rectangle.Builder setY1(double y1) {
            this.y1 = y1;
            return this;
        }

        public Rectangle.Builder setX2(double x2) {
            this.x2 = x2;
            return this;
        }

        public Rectangle.Builder setY2(double y2) {
            this.y2 = y2;
            return this;
        }

        public Rectangle.Builder setFillColor(String  fillColor) {
            this.fillColor = Color.valueOf(fillColor);
            return this;
        }

        public Rectangle.Builder setStrokeColor(String  strokeColor) {
            this.strokeColor = Color.valueOf(strokeColor);
            return this;
        }
    }
}
