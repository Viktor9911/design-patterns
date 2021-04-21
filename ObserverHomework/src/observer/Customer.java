package observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observable {
	
	private List<Observer>movies;
	private String customerName;

	public Customer() {
		this.movies = new ArrayList<>();
	}

	@Override
	public void buyMovie(Observer movie) {
		this.movies.add(movie);
		movie.setCustomer(this);


	}

	@Override
	public void returnMovie(Observer movie) {
		this.movies.remove(movie);

	}

	@Override
	public void NotifyMovies() {
		for(Observer movie: this.movies) {
			movie.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		this.NotifyMovies();
	}


}
