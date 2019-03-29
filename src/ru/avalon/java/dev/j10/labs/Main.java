package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes [i] = getInstance();
            System.out.print(shapes[i].getArea() + "\t");
        }
        
        Arrays.sort(shapes);
        System.out.println("");
        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].getArea() + "\t");
        }
        System.out.println(shapes[9].getArea());
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
    
    static Shape getInstance ()
    {
    int variable = new Random().nextInt(2);
    
             if (variable == 0){
        return new Circle();
    }
        else if (variable == 1){
            return new Triangle();
    }
        else {
            return new Rectangle();
        }
    }
}
