public class Passenger {
    
    private String name;

    /**
     * Constructor
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @param c
     */

    public String getName(){
        return this.name;
    }

    /**
     * Adds passenger to car c
     * @param c
     */
    public void boardCar(Car c){
        if (c.addPassenger(this) == true);
        


    }

    /**
     * Removes passenger from car c
     * @param c
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this) == true);


    
}

}
