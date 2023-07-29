package SOLID;

public class OpenClosePrinciple {

}

@FunctionalInterface
interface Shape {
    abstract public double calculateArea(); //{}
}

class Circle implements Shape {
    @Override
    public double calculateArea() {
        return 0;
    }
}

class Rectangle implements Shape {
    @Override
    public double calculateArea() {
        return 0; // должна быть реализация метода! не ставить 0!
    }
}

class Triangle implements Shape {
    @Override
    public double calculateArea() {
        return 0;
    }
}