package entities;

public class Product {
	
	private String name;
	private String email;
	private int IDroom;

	public Product(String name, String email, int IDroom) {
		this.name = name;
		this.email = email;
		this.IDroom = IDroom;
	}
	
	public void view() {
		System.out.println("Nome: "+ this.getName());
		System.out.println("Email: "+ this.getEmail());
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIDroom() {
		return IDroom;
	}

	public void setIDroom(int iDroom) {
		IDroom = iDroom;
	}
	
	public String toString(){
        return String.format("%d: %s, %s",
                getIDroom(), getName(), getEmail());
    }
	
	
	
	
	
	
}
