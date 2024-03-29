class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4,3);
        r1.getArea();
        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimeter of the rectangle: " + r1.getPerimeter());
        r1.resize(3);
        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimeter of the rectangle: " + r1.getPerimeter());
    }
}

abstract class Figure {
    private int numberOfSides;

    public Figure(){}

    public Figure(int numberSides){
        this.numberOfSides = numberSides;
    }

    public int getNumberOfSides(){
        return this.numberOfSides;
    }

    public abstract float getArea();

    public abstract float getPerimeter();
}

interface Resize {
    public void resize(float factor);
}

class Triangle extends Figure{
    private float width;
    private float height;

    public Triangle (float width, float height){
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea(){
        return width * height / 2;
    }

    @Override
    public float getPerimeter(){
        return (height * 2) + width;
    }
}

class Rectangle extends Figure{
    private float width;
    private float height;

    public Rectangle (float width, float height){
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea(){
        return width * height;
    }

    @Override
    public float getPerimeter(){
        return (width + height) * 2;
    }

    void resize(float factor){
        this.width *= factor;
        this.height *= factor;
    }

}
