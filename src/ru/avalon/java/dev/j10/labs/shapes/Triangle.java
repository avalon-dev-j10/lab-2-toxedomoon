package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    public final float x1, y1;//Точка один
    public final float x2, y2;//Точка два
    public final float x3, y3;//Точка три
    
    private final float lineAB;//Линия AB
    private final float lineBC;//Линия BC
    private final float lineCA;//Линия CA

    public Triangle() {
        this.x1 = Point.getX();
        this.y1 = Point.getY();
        this.x2 = Point.getX();
        this.y2 = Point.getY();
        this.x3 = Point.getX();
        this.y3 = Point.getY();
        
        this.lineAB = (float) (Math.sqrt((float) 
                (Math.pow(x2 - x1, 2))
            + (float) 
                (Math.pow(y2 - y1, 2))));
        
        this.lineBC = (float) (Math.sqrt((float) 
                (Math.pow(x3 - x2, 2))
            + (float) 
                (Math.pow(y3 - y2, 2))));
        
        this.lineCA = (float) (Math.sqrt((float) 
                (Math.pow(x1 - x3, 2))
            + (float) 
                (Math.pow(y1 - y3, 2))));
}
    @Override
    public float getPerimeter() {
        return lineAB + lineBC + lineCA;
    }

    
    @Override
    public float getArea() {
        float poluPerimeter = this.getPerimeter()/2;
        return (float)Math.sqrt(poluPerimeter*(poluPerimeter-lineAB)*(poluPerimeter-lineBC)*(poluPerimeter-lineCA));
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
