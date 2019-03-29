package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    public final float x1, y1;//Точка один
    public final float x2, y2;//Точка два
    public final float x3, y3;//Точка три
    public final float x4, y4;//Точка три
    
    private final float lineAB;//Линия AB
    private final float lineBC;//Линия BC
    private final float lineCD;//Линия CD
    private final float lineCA;//Линия CA
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    public Rectangle() {
        this.x1 = Point.getX();
        this.y1 = Point.getY();
        this.x2 = Point.getX();
        this.y2 = Point.getY();
        this.x3 = Point.getX();
        this.y3 = Point.getY();
        this.x4 = Point.getX();
        this.y4 = Point.getY();
        this.lineAB = (float) (Math.sqrt((float) (Math.pow(x2 - x1, 2))
                + (float) (Math.pow(y2 - y1, 2))));
        this.lineBC = (float) (Math.sqrt((float) (Math.pow(x3 - x2, 2))
                + (float) (Math.pow(y3 - y2, 2))));
        this.lineCD = (float) (Math.sqrt((float) (Math.pow(x4 - x3, 2))
                + (float) (Math.pow(y4 - y3, 2))));
        this.lineCA = (float) (Math.sqrt((float) (Math.pow(x1 - x4, 2))
                + (float) (Math.pow(y1 - y4, 2))));
    }

    @Override
    public float getPerimeter() {
        return lineAB + lineBC + lineCD + lineCA;
    }

    @Override
    public float getArea() {
        float poluPerimeter = this.getPerimeter() / 2;
        return (float) Math.sqrt(poluPerimeter * (poluPerimeter - lineAB) * (poluPerimeter - lineBC) * (poluPerimeter - lineCD)*(poluPerimeter - lineCA));
    }
}
