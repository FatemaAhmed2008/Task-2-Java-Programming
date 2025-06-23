


import java.util.ArrayList;

public class AirplaneStatus {

    static class Airplane {
        private String flightNumber;
        private String destination;
        private String departureTime;
        private int delayMinutes;

        public Airplane(String flightNumber, String destination, String departureTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
            this.delayMinutes = 0;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getDestination() {
            return destination;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public int getDelayMinutes() {
            return delayMinutes;
        }

        public void setDelayMinutes(int delayMinutes) {
            this.delayMinutes = delayMinutes;
        }

        public String getFlightStatus() {
            if (delayMinutes == 0) {
                return "Flight " + flightNumber + " is on time.";
            } else {
                return "Flight " + flightNumber + " is delayed by " + delayMinutes + " minutes.";
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Airplane> flights = new ArrayList<>();

        Airplane flight1 = new Airplane("CDE345", "New York", "10:00 AM");
        Airplane flight2 = new Airplane("KUI765", "London", "2:30 PM");
        Airplane flight3 = new Airplane("JUY456", "Tokyo", "6:45 PM");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        System.out.println("Flight Status:");
        for (Airplane flight : flights) {
            System.out.println(flight.getFlightStatus());
        }

        flight1.setDelayMinutes(40);
        flight2.setDelayMinutes(110);

        System.out.println("\nCurrent Flight Status:");
        for (Airplane flight : flights) {
            System.out.println(flight.getFlightStatus());
        }
    }
}
