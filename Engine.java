public class Engine {
    private FuelType fuel_type;
    private double CurrentFuelLevel;
    private double MaxFuelLevel;

    /**
     * Constructor
     * @param fuel_type
     * @param current_fuel_level
     * @param max_fuel_level
     */

    public Engine(FuelType fuel_type, double current_fuel_level, double max_fuel_level) {
        this.fuel_type  = fuel_type;
        this.CurrentFuelLevel = current_fuel_level;
        this.MaxFuelLevel = max_fuel_level;

    }

    /**
    * Getter for Fuel Type
    * @return
    */

    public FuelType getFuelType() {
        return this.fuel_type;
    }

    /**
    * Getter for Current Fuel Level
    * @return
    */

    public double getCurrentFuelLevel() {
        return this.CurrentFuelLevel;
    }

    /**
    * Getter for Max Fuel Level
    * @return
    */

    public double getMaxFuelLevel() {
        return this.MaxFuelLevel;
    }


    /** 
    * Setter for Fuel Type
    * @param new_fuel_type
    */
    public void setFuelType(FuelType new_fuel_type){
        this.fuel_type = new_fuel_type;
    }

    // Methods

   /**
    * Resets the current fuel level to the maximum fuel level
    */
    public void refuel(){
        this.CurrentFuelLevel = MaxFuelLevel;
    }
    


    /**
     * Decreases the current fuel level and prints what the fuel level is
     * @return T/F depending on if the current fuel level is greater than 0 or not
     */
    public boolean go(){
        this.CurrentFuelLevel = CurrentFuelLevel - 50;
        System.out.println("Current Fuel Level:" + CurrentFuelLevel);
        if(CurrentFuelLevel > 0) {
            return true;
        } else{
            return false;
        }
        }
        
    

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.00);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    
}

