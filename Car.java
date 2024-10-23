import java.util.ArrayList;
public class Car {
    private int maximum_capacity;
    private ArrayList<Passenger> passengers_on_board;

    /**
     * Constructor
     * @param maximum_capacity
     */
    public Car(int maximum_capacity) {
        this.maximum_capacity = maximum_capacity;
        this.passengers_on_board = new ArrayList<Passenger>(maximum_capacity);
       

        
    }

    /**
     * Getter for capacity
     * @return Int for maximum capacity on the car
     */
    public int getCapacity() {
        return this.maximum_capacity;

    }

    /**
     * Getter for number of seats remaining on car
     * @return Int of how many seats are left on car
     */
    public int seatsRemaining(){
        return (this.maximum_capacity - passengers_on_board.size());
    }

    /**
     * Adds a passenger to the car if there are remaining seats on the car
     * @param p
     * @return T/F depending on if the passenger was added or not
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            if (passengers_on_board.contains(p)){
                return false;
            } else {
                passengers_on_board.add(p);
                return true;
            } } 
            else {
            return false;
        }
        
    }

    /**
     * Removes a passenger from the car as long as they were originally on the car
     * @param p
     * @return T/F depending on if the passenger was removed or not
     */
    public boolean removePassenger(Passenger p) {
        if (passengers_on_board.contains(p)) {
            passengers_on_board.remove(p);
            return true;
        } else {
            return false;
        }
        
    }

    /**
     * Prints a list of the remaining passengers on the car
     */
    public void printManifest(){
        if ((passengers_on_board.size()) > 0){
            for (int i = 0; i < passengers_on_board.size(); i++){
                System.out.println(passengers_on_board.get(i).getName());
            }
        } else{
            System.out.println("This car is EMPTY.");
        }
    }

    /**
     * Main method
     * @param args command line arguments passed into methods
     */
    public static void main(String[] args) {
        Car myCar = new Car(500);
        Passenger passenger = new Passenger("Bebe");
        myCar.addPassenger(passenger);
        myCar.printManifest();
        myCar.removePassenger(passenger);
        myCar.printManifest();
    }

}