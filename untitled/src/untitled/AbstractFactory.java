package untitled;

public class AbstractFactory {
    public static void main(String[] args) {
        Factory KFC_01 = new KFC();
        Factory MDL_01 = new MDL();
        KFC_01.CreatBurger().show();
    }
}
interface Factory{
    Burger CreatBurger();
    Chicken CreatChicken();
    Drink CreatDrink();
}

class KFC implements Factory{

    @Override
    public Burger CreatBurger() {
        return new Burger_01();
    }

    @Override
    public Chicken CreatChicken() {
        return new Chicken_01();
    }

    @Override
    public Drink CreatDrink() {
        return new Drink_01();
    }
}
class MDL implements Factory{

    @Override
    public Burger CreatBurger() {
        return new Burger_02();
    }

    @Override
    public Chicken CreatChicken() {
        return new Chicken_02();
    }

    @Override
    public Drink CreatDrink() {
        return new Drink_02();
    }
}
interface Burger{
    void show();
}
interface Chicken{
    void show();
}
interface Drink{
    void show();
}
class Burger_01 implements Burger{
    @Override
    public void show(){
        System.out.println("KFC的汉堡");
    }
}
class Burger_02 implements Burger{
    @Override
    public void show(){
        System.out.println("MDL的汉堡");
    }
}
class Chicken_01 implements Chicken{
    @Override
    public void show(){
        System.out.println("KFC的炸鸡");
    }
}
class Chicken_02 implements Chicken{
    @Override
    public void show(){
        System.out.println("MDL的炸鸡");
    }
}
class Drink_01 implements Drink{
    @Override
    public void show(){
        System.out.println("KFC的咖啡");
    }
}
class Drink_02 implements Drink{
    @Override
    public void show(){
        System.out.println("MDL的果汁");
    }
}