package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void testAddUser() throws Exception {
        User u1 = new User();
        User u2 = new User();

        u1.addFriend(u2);

        assertTrue(u1.isFriendsWith(u2));
    }

    @Test
    public void testUserTrip(){

        //
        // Initialize User
        //
        User u1 = new User();

        //
        // Initialize Trip
        //
        Trip t1 = new Trip();
        Trip t2 = new Trip();

        //
        // Add Trip to u1
        //
        u1.addTrip(t1);
        u1.addTrip(t2);

        //
        // Create List with trips
        //
        List<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);

        //
        // Test if u1.trips() is equal as trips
        //
        Assertions.assertEquals(trips, u1.trips);
    }

    @Test
    public void testGetUserTrip(){

        //
        // Initialize User
        //
        User u1 = new User();

        //
        // Initialize Trip
        //
        Trip t1 = new Trip();
        Trip t2 = new Trip();

        //
        // Add Trip to u1
        //
        u1.trips.add(t1);
        u1.trips.add(t2);

        //
        // Create List with trips
        //
        List<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);

        //
        // Test if u1.trips() is equal as trips
        //
        Assertions.assertEquals(trips, u1.trips());
    }

}
