package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number: ");
		int RoomQuantity = sc.nextInt();
		Product[] vect = new Product[RoomQuantity];
		
		boolean status;
		
		String name, email;
        int n, IDroom;
        
        System.out.print("How many rooms will be rented? ");
		
		
		 	do{
	            n = sc.nextInt();
	            if (n >= 1 && n <= 10){
	                status = true;
	            }else{
	                System.out.println("Only allowed range 1-10 to set quantity of rooms");
	                
	                System.out.print("Please, pay attention! Enter valid value: ");
	                status= false;
	            }
	        }while(status == false);
		 	
			

			for(int i = 0; i<n; i++) {
				
				sc.nextLine();
				System.out.println("Name: ");
				name = sc.nextLine();
				System.out.println("Email: ");
				email = sc.nextLine();
				System.out.print("Room: ");
				IDroom = sc.nextInt();
				vect[IDroom] = new Product(name,email,IDroom);
				
			}
					
			System.out.println("\nBusy rooms:");
	        for (Product room : vect) {
	            if (room != null) {
	                System.out.println(room);
	            }
	        }
	        System.out.println();
			
		sc.close();

	}

}
