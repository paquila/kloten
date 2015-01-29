import java.util.Scanner;
public class apples{
	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		tonijn tonijnObject = new tonijn ();
		 System.out.println ("Wat was de naam van je eerste vriendin?");
		 String bewaarbak = input.nextLine();
		 tonijnObject.SetName(bewaarbak);
		 tonijnObject.saying();
		  
				
				

		
	}

}