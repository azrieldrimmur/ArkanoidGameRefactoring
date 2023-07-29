package SOLID;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        penguin.canEat();

        FlyingBird bird = new FlyingBird();
        bird.canEat();
        bird.canFly();

        Bird someBird = new FlyingBird();
        someBird.canEat();
//        someBird.canFly();

//        penguin.canFly();
//        int penguinInt = 100;

    }
}


class Bird {
    void canEat() {

    }
}

class FlyingBird extends Bird{
    void canFly() {

    }
}

class Penguin extends Bird {

}

