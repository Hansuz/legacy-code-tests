package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void testAddFriend() {

        //
        // Initialize User
        //
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        //
        // Add User to friend u1
        //
        u1.addFriend(u2);
        u1.addFriend(u3);

        //
        // Create List with friends
        //
        List<User> friends = new ArrayList<User>();
        friends.add(u2);
        friends.add(u3);

        //
        // Test if u1.friends is equal as friends
        //
        Assertions.assertEquals(friends, u1.friends);
    }

    @Test
    public void testGetFriend() {

        //
        // Initialize User
        //
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        //
        // Add User to friend u1
        //
        u1.friends.add(u2);
        u1.friends.add(u3);

        //
        // Create List with friends
        //
        List<User> friends = new ArrayList<User>();
        friends.add(u2);
        friends.add(u3);

        //
        // Test if u1.getFriends() is equal as friends
        //
        Assertions.assertEquals(friends, u1.getFriends());
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
