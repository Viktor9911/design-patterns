package observer;

public interface Observable {
	
	void buyMovie(Observer movie);
	void returnMovie(Observer movie);
	void NotifyMovies();
	String getUpdate();
}
