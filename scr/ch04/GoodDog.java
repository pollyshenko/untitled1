package ch04;

public class GoodDog {
    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }
    void bark(){
        if(size > 60){
            System.out.println("гав гав!");
        } else
            if(size >14){
                System.out.println("вуф вуф!");
            } else {
                System.out.println("тяф тяф!!!");
            }

    }


}
