package ch04;

public class GoodDogArrayTest {
    public static void main(String[] args){
        GoodDog[] pets = new GoodDog[7];
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(3);

        System.out.println("size pets[0] - " + x);
        System.out.println("pets[1] - " + pets[1].getSize());
        pets[0].bark();
        pets[1].bark();


    }
}
