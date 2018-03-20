package se.lexicon.model;

import java.util.ArrayList;

public class Airplane {

    String airplaneName;
    List<Passenger> airplaneSeats = new ArrayList<>(10);

    /**
     * Airplane Constructor
     * @param airplaneName Airplane unique identifier
     * @param airplaneSeats Total number of seats available
     */
    public Airplane(String airplaneName, List<Passenger> airplaneSeats) {
        this.airplaneName = airplaneName;
        this.airplaneSeats = airplaneSeats;
    }

    /**
     * Returns airplane name. Useful in toStrings.
     * @return airplaneName
     */
    public String getAirplaneName() {
        return airplaneName;
    }

    /**
     * Sets airplane name. Useful when creating new Airplanes.
     * @param airplaneName Airplane name
     */
    // TODO: Redundant method?
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    /**
     * Returns list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @return airplaneSeats
     */
    public List<Passenger> getAirplaneSeats() {
        return airplaneSeats;
    }

    /**
     * Sets list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @param airplaneSeats Number of airplane seats
     */
    // TODO: Redundant method? Useful when creating new Airplanes with different number of seats.
    public void setAirplaneSeats(List<Passenger> airplaneSeats) {
        this.airplaneSeats = airplaneSeats;
    }

    @Override
    public String toString() {
        return "Flygplan " + getAirplaneName() + " har " + getAirplaneSeats() + " bokade platser.";
    }
}
