package observer;

public class Movie implements Observer {

	private String name;
	private Observable customer;
	
	public Movie(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.customer == null){
            System.out.println(this.getName() + " is free");
        }
		String newCustomer = this.customer.getUpdate();
		System.out.println(this.getName() + " is get from: " + newCustomer);
		return;

	}
	
	public String getName() {
		
		return name;
	}

	

	@Override
	public void setCustomer(Observable customer) {
		this.customer = customer;

	}

}
