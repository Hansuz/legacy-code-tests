package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TripServiceTest {

    private User nonLoggedUser = null;
    private User unUsedUser = new User();
    private User loggedUser = new User();

    private TripService tripService;

    @Before
    public void initialise() {
        tripService = createTripService();
    }

    @Test(expected = UserNotLoggedInException.class)
    public void ThrowExceptionIfUserIsNotLogged() throws Exception {
        tripService.getFriendTrips(nonLoggedUser, unUsedUser);
    }

    @Test
    public void NotReturnTripsWhenLoggedUserIsNotAFriend() throws Exception {
        List<Trip> friendTrips = tripService.getFriendTrips(loggedUser, anUser().build());

        assertTrue(friendTrips.isEmpty());
    }

    @Test
    public void ReturnTripsWhenLoggedUserIsAFriend() throws Exception {
        User john = anUser().friendsWith(loggedUser)
                .withTrips(new Trip(), new Trip())
                .build();

        List<Trip> friendTrips = tripService.getFriendTrips(loggedUser, john);

        assertThat(friendTrips, is(equalTo(john.trips())));
    }

    private TripService createTripService() {
        return new TripService() {
            @Override protected List<Trip> findTripsForFriend(User user) {
                return user.trips();
            }
        };
    }

}
