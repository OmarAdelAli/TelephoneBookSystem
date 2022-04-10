import java.util.*;


public class PhoneBook {

	public static void main(String[] args) {

		List newList = new List();
		Scanner in = new Scanner(System.in); 

		String menu;
		boolean done = false;
		String firstName ;
		String lastName ;
		String phoneNumber ;
		String city ;
		String address ;
		String sex ;
		String email ;


		do {
			System.out.println();
			System.out.format("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^%n");
			System.out.format("{1} Add persons details   \n{2} Delete person details by phone number  \n{3} Update telephone number by First Name"
					+ " \n{4} Display all details of persons  "
					+ " \n{5} Search telephone number based on person first name  "
					+ "\n{6} Sort all persons  based on person first name "
					+ "\n{7} Exit the program \n");	
			System.out.format("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^%n");
			System.out.format("Please Enter a command from list :  ");
			menu = in.nextLine().toUpperCase();

			switch (menu) {
				case "1": 
					System.out.println("Add details ");
					
					System.out.print("Enter a First Name: ");
					 firstName = in.nextLine();
					System.out.print("Enter a last Name: ");
					 lastName = in.nextLine();
					 System.out.print("Enter a Phone Number : ");
					phoneNumber = in.nextLine();
					System.out.print("Enter a City : ");
					 city = in.nextLine();
					 System.out.print("Enter an Address : ");
					 address = in.nextLine();
					 System.out.print("Enter a Sex : ");
					 sex = in.nextLine();
					System.out.print("Enter an Email : ");
					 email = in.nextLine();

					
	
					newList.add(firstName  , lastName    , phoneNumber  , city   ,  address ,  sex , email); 
					break;
				case "2": 
					System.out.print("Enter a Phone Number to delete: ");
					String delete = in.nextLine();
					newList.delete(delete);
					break;
				case "3": 
					System.out.println(" Enter First Name to Update Telephone Number : ");
					String update = in.nextLine();
					System.out.println("Enter the New Telephone Number : ");
					String newPhone = in.nextLine();
					newList.update(update, newPhone);
					break; 
				case "4": 
					System.out.println("Print Phonebook");
					newList.printList();
					break; 
				case "5": 
				
					System.out.print("Enter an First Name  to Search for : ");
					 firstName = in.nextLine();
					String result =	newList.searchByFirstName(firstName);
					if(result != "")
						System.out.print("The Phone Number of " + firstName + "  is  " + result);
			
					break; 
				
				case "6": 
					System.out.println("Sort Phonebook");
					newList.sortList();
					newList.printList();
					break; 
			
			
				case "7": 
					System.out.println(" { Exit successfully } ");
					done = true;
					break;
				default: 
					System.out.println("Unknown Entry");
			}

		}  while (!done);
		System.out.println(" { Thanks for using Telephone Book System } ");

	}
}
