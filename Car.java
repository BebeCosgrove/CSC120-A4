import java.util.ArrayList;
public class Car {
    private int MaximumCapacity;
    private ArrayList<Passenger> passengersOnBoard;

    /**
     * Constructor
     * @param maximum_capacity
     */
    public Car(int maximum_capacity) {
        this.MaximumCapacity = maximum_capacity;
        this.passengersOnBoard = new ArrayList<Passenger>(MaximumCapacity);
       

        
    }

    /**
     * Getter for capacity
     * @return Int for maximum capacity on the car
     */
    public int getCapacity() {
        return this.MaximumCapacity;

    }

    /**
     * Getter for number of seats remaining on car
     * @return Int of how many seats are left on car
     */
    public int seatsRemaining(){
        return (this.MaximumCapacity - passengersOnBoard.size());
    }

    /**
     * Adds a passenger to the car if there are remaining seats on the car
     * @param p
     * @return T/F depending on if the passenger was added or not
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengersOnBoard.add(p);
            return true;
        }
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
        if (passengersOnBoard.contains(p)) {
            passengersOnBoard.remove(p);
            return true;
        }
        else {
            return false;
        }
        
    }

    /**
     * Prints a list of the remaining passengers on the car
     */
    public void printManifest(){
        if ((passengersOnBoard.size()) > 0){
            for (int i = 0; i < passengersOnBoard.size(); i++){
                System.out.println(passengersOnBoard.get(i).getName());
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car(500);
        Passenger passenger = new Passenger("Bebe");
        myCar.addPassenger(passenger);
        myCar.printManifest();
        myCar.removePassenger(passenger);
        myCar.printManifest();
    }

}