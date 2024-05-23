package ch02;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int giessp1 = 0;
        int giessp2 = 0;
        int giessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9");

        while(true) {
            System.out.println("Число которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            giessp1 = p1.number;
            System.out.println("1 Игрок думает, что это число - " + giessp1);

            giessp2 = p2.number;
            System.out.println("2 Игрок думает, что это число - " + giessp2);

            giessp3 = p3.number;
            System.out.println("3 Игрок думает, что это число - " + giessp3);

            if(giessp1 == targetNumber){
                p1isRight = true;
            }

            if(giessp2 == targetNumber){
                p2isRight = true;
            }

            if(giessp3 == targetNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight){

                System.out.println("У нас есть победитель");
                System.out.println("1 игрок угадал?" + p1isRight);
                System.out.println("2 игрок угадал?" + p2isRight);
                System.out.println("3 игрок угадал?" + p3isRight);
                break;
            }
            else {
                System.out.println("игру нужно запустить снова.");
            }
        }
    }
}
