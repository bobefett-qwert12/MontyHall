public class MontyHall {
    private int ranUser;
    private int ranCar;

    /**
     * Creates a new instance of MontyHall
     * @param ranUser the randomly-chosen user's door
     * @param ranCar the randomly-chosen car's door
     */
    public MontyHall(int ranUser, int ranCar) {
        this.ranUser = ranUser;
        this.ranCar = ranCar;
    }

    /**
     * Checks if the user's door and the random car-door are the same door
     * @return returns true or false
     */
    public boolean userCarTest(){
        if(this.ranUser == this.ranCar){
            return true;
        }else{
            return false;
        }
    }
}
