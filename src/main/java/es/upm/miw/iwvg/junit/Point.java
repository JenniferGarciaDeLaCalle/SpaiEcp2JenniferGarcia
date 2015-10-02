package es.upm.miw.iwvg.junit;

public class Point {
    
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }
    
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public void puntoMedio(){
        this.x = this.x/2;
        this.y = this.y/2;       
    }
    
    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
}
