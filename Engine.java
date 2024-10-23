public class Engine {
    private FuelType fuel_type;
    private double current_fuel_level;
    private double max_fuel_level;

    /**
     * Constructor
     * @param fuel_type fuel type
     * @param current_fuel_level current fuel type
     * @param max_fuel_level max fuel level
     */

    public Engine(FuelType fuel_type, double current_fuel_level, double max_fuel_level) {
        this.fuel_type  = fuel_type;
        this.current_fuel_level = current_fuel_level;
        this.max_fuel_level = max_fuel_level;

    }

    /**
    * Getter for Fuel Type
    * @return returns the fuel_type value
    */

    public FuelType getFuelType() {
        return this.fuel_type;
    }

    /**
    * Getter for Current Fuel Level
    * @return returns the current_fuel_level
    */

    public double getCurrentFuelLevel() {
        return this.current_fuel_level;
    }

    /**
    * Getter for Max Fuel Level
    * @return returns the max_fuel_level
    */

    public double getMaxFuelLevel() {
        return this.max_fuel_level;
    }


    /** 
    * Setter for Fuel Type
    * @param new_fuel_type new value that fuel_type is to be changed to
    */
    public void setFuelType(FuelType new_fuel_type){
        this.fuel_type = new_fuel_type;
    }

    // Methods

   /**
    * Resets the current fuel level to the maximum fuel level
    */
    public void refuel(){
        this.current_fuel_level = max_fuel_level;
    }
    


    /**
     * Decreases the current fuel level and prints what the fuel level is
     * @return T/F depending on if the current fuel level is greater than 0 or not
     */
    public boolean go(){
        System.out.println("Current Fuel Level:" + current_fuel_level);
        if(current_fuel_level - 50  >= 0) {
            this.current_fuel_level = current_fuel_level - 50;
            return true;
        } else{
            System.out.println("Minimum Fuel Level: 50. Refuel and go");
            return false;
        }
        }
        
    

        /**
     * Main method
     * @param args command line arguments passed into methods
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.00);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    
}

