package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TripService {

	public List<Trip> getFriendTrips(User loggedUser, User friend) throws UserNotLoggedInException {
		validate(loggedUser);
		return (friend.isFriendsWith(loggedUser))
				? findTripsForFriend(friend)
				: new ArrayList<Trip>();
	}

	private void validate(User loggedUser) throws UserNotLoggedInException {
		if (loggedUser == null) throw new UserNotLoggedInException();
	}

	protected List<Trip> findTripsForFriend(User friend) {
		return TripDAO.findTripsByUser(friend);
	}
	
}
