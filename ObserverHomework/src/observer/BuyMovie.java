package observer;

public class BuyMovie {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Movie movie1 = new Movie("Gladiator");
		Movie movie2 = new Movie("Inception");
				
		customer.buyMovie(movie1);
		customer.buyMovie(movie2);
		
		customer.setCustomerName("Viki");
		customer.setCustomerName("Niki");
	}

}