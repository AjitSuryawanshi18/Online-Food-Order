package Online_Food_Order;
import java.util.*;
public class Customer_Swiggy_Driver {

	public static void main(String[] args) {
		Scanner SC= new Scanner (System.in); 
		System.out.println("Welcome to Swiggy :) Foodies First and Last Choice...! ");
		System.out.println(" Enter Your Food Interrest...!");
		String Foodintrest = SC.next();
		Customer_Swiggy C1 = new Customer_Swiggy(Foodintrest);
		boolean exit =true;
		
		while(exit) {
			
			System.out.println("\n Enter Your Choice :\n 1. Order Food \n 2. Cancel Order \n 3. Update Order \n 4. Display Order \n 5. Exit ");
			int Choice = SC.nextInt();
			
			switch(Choice) {
			
			case 1 :
			{
				System.out.println(" Enter Your Details :\n ");
				System.out.println(" Enter Your name : ");
				String cname = SC.next();
				System.out.println(" Enter Your Address : ");
				String address = SC.next();
				System.out.println(" Enter Your Contact Number : ");
				String number = SC.next();
				System.out.println(" Enter Your Product : ");
				String product = SC.next();
				
				C1.placeOrder(new Customer(cname,address, number,product));
			}
			break;
			case 2 :{
				C1.cancelOrder();
			}
			break;
			
			case 3 :{
				C1.updateOrder();
			}
			break;
			case 4 :{
				C1.displayOrder();
			}
			break;
			case 5 :{
				exit= false;
				System.out.println("You are Exit NoW ");
			}
			break;
			default :{
				
				System.out.println("----------Invalid OPtion-----------");
				
			  }
			}
		  }
        }

}
