// print report and web report inherit from report

package com.itesm.financial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Report {

    public String createContent(List<Ride> rides) {
        StringBuilder builder = new StringBuilder();
        builder.append(createHeaders("Taxi Report"));
        builder.append(createTableHeaders());
        rides.forEach( ride -> {
            builder.append(addRide(ride));
        });
        builder.append(closeTableHeaders());

        return builder.toString();
    }
    protected String createHeaders(String title){
        return "";
    }
    protected String createTableHeaders() {
        return "";
    }
    protected String addRide(Ride ride) {
        return "";
    }
    protected String closeTableHeaders() {
        return "";
    }
}