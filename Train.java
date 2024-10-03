import java.util.ArrayList;
public class Train {
    private FuelType fuelType;
    private double fuelCapacity;
    private int nCars;
    private int passengerCapacity;
    private Engine engine;
    private ArrayList<Car> car_list;
    


    /**
     * Constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;


        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.car_list = new ArrayList<Car>(nCars);

        for (int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            car_list.add(car);
        }

    }

    /**
     * Getter for engine
     * @return
     */

    public Engine getEngine(){
        return engine;
    }

    /**
     * Getter to return the "i"th car
     * @param i
     * @return
     */
    public Car getCar(int i){
        return(car_list.get(i));
    }

    /**
     * Getter that returns the maximum total capacity for all the cars combined
     * @return
     */
    public int getMaxCapacity(){
        return(passengerCapacity * nCars);
    }

    /**
     * Getter that returns the number of seats remaining across all of the cars
     * @return
     */
    public int seatsRemaining(){
        int number_of_seats_remaining = 0;
        for (int i = 0; i < nCars; i++){
            Car car = car_list.get(i);
            number_of_seats_remaining += car.seatsRemaining();

    }
    return(number_of_seats_remaining);
    }

    /**
     * Prints a roster of all the passengers aboard all the cars
     */
    public void printManifest(){
        for (int i = 0; i < nCars; i++){
            Car car = car_list.get(i);
            car.printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 200.00, 5, 50);
        Passenger passenger = new Passenger("Bebe");
        passenger.boardCar(myTrain.getCar(0));
        myTrain.printManifest();
        passenger.getOffCar(myTrain.getCar(0));
        myTrain.printManifest();

    }
        





}



