import java.util.Random;
public class MontyHallTester {
    public static void main(String[] args) {
        int switchCounter = 0;
        int stayCounter = 0;
        Random ran = new Random();
        while(switchCounter + stayCounter < 1000) {
            int ranUser = (ran.nextInt(3) + 1) * 3;
            int ranCar = (ran.nextInt(3) + 1) * 3;
            MontyHall test = new MontyHall(ranUser, ranCar);
            if (!test.userCarTest()){
                switchCounter++;
            }else{
                stayCounter++;
            }
        }
        System.out.println("Switching was the best strategy in " + switchCounter + " out of 1000 games.");
    }
}