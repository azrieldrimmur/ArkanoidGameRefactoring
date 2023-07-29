package SOLID;

public class SingleResponsibilityPrinciple {

}

// здесь нарушается принцип единственности ответственности S - Single Responsibility Principle
class Employee_Wrong_Sample {
    public void calculateSalary() {
        //реализация метода
    }

    public void printReport() {
        // реализация метода
    }
}

// ниже представлено правильное решение согласно SOLID
class Employee {
    public void calculateSalary() {
        //реализация метода
    }
}

class PrintReport {
    public void printReport() {
        // реализация метода
    }
}
