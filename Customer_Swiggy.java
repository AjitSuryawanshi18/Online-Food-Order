package Online_Food_Order;
import java.util.*;
public class Customer_Swiggy {
        String vegnonveg;
        Customer C;
        

            public Customer_Swiggy(String vegnonveg) {
	
            	this.vegnonveg = vegnonveg;
           }
 

     public void placeOrder(Customer C) {
    	  if(this.C!=null) {
    		  System.out.println(" oohhoo Order Already Placed.....");
    		  }else {
    			  this.C=C;
    			  System.out.println(" Yuppp Your Order iS Placed Successfully....It will be delivered Within 45 min...! ");
    			  Random otp= new Random();
    			  long otppass=otp.nextLong(1000000);
    			  System.out.println("Your one time password is : "+otppass);
    			  System.out.println("share with delivery person after confirming your order menu....!");
    		  }
      }
      
      
      // i am trying to throw an exception if someone trying to cancel order before place the order
      
      public class OrderIsNotPlacedException extends RuntimeException{

    		public  OrderIsNotPlacedException(String msg) {
    			super(msg);
    		}
    	}
      
      
      public void cancelOrder() {
    	  if(this.C!=null) {
    		  Scanner sc = new Scanner(System.in);
    		  System.out.println("Sure want to cancel please confirm Again[yes/no]");
    		  String ans=sc.next();
    		  
    		  if(ans.equalsIgnoreCase("yes")){
    			  this.C=null;
        		  System.out.println(" Your Order Canccelled Successfullyy..... ");
        	
    		  }else {
    			  System.out.println("Great Decision Your Order on the way...!");
    		  }
    	  }else {
    		 throw new OrderIsNotPlacedException("Order is not Placed...Please Place Order First ...!");
    	  }
      }
      
      // above code will executed the throw exception part 
     
      public void updateOrder() {
    	  if(this.C!=null) {
    		  
    		  Scanner Sc = new Scanner (System.in);
    		  System.out.println(" Enter Your New Address : ");
    		  String newadd =Sc.next();
    		  C.setcAddress(newadd);
    		  System.out.println(" Enter Your New Number : ");
    		  String newnum =Sc.next();
    		  C.setcCNO(newnum);
    		  System.out.println(" Enter Your New Product  : ");
    		  String newproduct =Sc.next();
    		  C.setcProduct(newproduct);
    		  System.out.println(" Your Order Updated Successfullyy...!");
    		  
    		  }else {
    		  System.out.println(" First Place  Order Then Only we able to Cancel it...!");
    	  }
      }
 
      public void displayOrder() {
    	  if(this.C!=null) {
    		  System.out.println("------------------------------------------");
    		System.out.println("Your Order Details are Follow  ");
    		System.out.println("Food Type : "+ vegnonveg);
    		System.out.println("Your Name : "+ C.getcName()); 
    		System.out.println("Your Address is :"+ C.getcAddress());
    		System.out.println("Your Number is : "+ C.getcCNO());
    		System.out.println("Your Ordered Product is : "+ C.getcProduct());
    		
    		System.out.println("---------------------------------------------");
    	  }else {
    		 System.out.println(" First Place Your Order please..!"); 
    	  }
      }
   }
