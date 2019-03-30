package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{

    private final float x1, y1;//Точка один
    private final float x2, y2;//Точка два
    
    
    //Генерируем конструктор координат точек
    public Circle() {
        this.x1 = Point.getX();
        this.y1 = Point.getY();
        this.x2 = Point.getX();
        this.y2 = Point.getY();
    }
    
    public float getRadius(){
        return (float) (Math.sqrt((float) (Math.pow(x2 - x1, 2))
                + (float) (Math.pow(y2 - y1, 2)))); //Формула определения длинны отрезка по кординатам двух точек
    }
    
    @Override
    public float getLength() {
        return (float)(2 * Math.PI * this.getRadius());
    }


    @Override
    public float getArea() {
        return (float) Math.PI * (float) (Math.pow(this.getRadius(), 2));
    }

    @Override
    public int getRotation() {
        return 0;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
