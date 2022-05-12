package com.itesm.financial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PrintReport extends Report{


    public void createFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("financial-report.md");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(content);
        printWriter.close();
    }
    protected String createHeaders(String title){
        return "## " + title + "\n";
    }

    protected String createTableHeaders() {
        return "| TaxiID " +
                    "| Pickup time " +
                    "| Dropoff time " +
                    "| Passenger count " +
                    "| Trip Distance " +
                    "| Total amount |" +
                "\n" +
                "| :--- | :--- | :--- | :--- | :--- | :--- | \n";
    }

    protected String closeTableHeaders() {
        return "\n";
    }

    protected String addRide(Ride ride) {
        return "| " + ride.getTaxiId() + " " +
                "| " + ride.getPickUpTime() + " " +
                "| " + ride.getDropOffTime() + " " +
                "| " + ride.getPassengerCount() + " " +
                "| " + ride.getTripDistance() + " " +
                "| " + formatAmount(ride.getTollsAmount()) + " | \n";
    }

    private String formatAmount(double amount) {
        if(amount < 0) {
            return "(" + amount + ")";
        }
        return Double.toString(amount);
    }
}