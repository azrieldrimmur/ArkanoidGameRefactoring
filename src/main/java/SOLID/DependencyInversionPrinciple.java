package SOLID;

public class DependencyInversionPrinciple {
    //принцип инверсии зависимостей

}

interface SavingData {
    void saveData();
}

class Levels implements SavingData{
    @Override
    public void saveData() {

    }
    //    void saveLevelData() {
//        Rewards rewards = new Rewards();
//        rewards.saveData();
//    }
}

class Rewards implements SavingData{
//    void saveData() {
//        //пишт данные в нашу базу данных достижений и уровней
//    }
    @Override
    public void saveData() {

    }
}
