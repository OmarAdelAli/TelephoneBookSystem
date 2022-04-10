public class List  {

	private Node head;
    private Node tail;
	private int length;

	public List() {
		head = tail = null;
		length = 0;
	}


	public void add(String firstName,String lastName,String phoneNumber , String city , String address , String sex , String email ) {
  
		Node newNode = new Node();
    newNode.setFirstName(firstName);
    newNode.setLastName(lastName);
	newNode.setPhoneNumber(phoneNumber);
    newNode.setCity(city);
    newNode.setAddress(address);
    newNode.setSex(sex);
	newNode.setEmail(email);

		if (isEmpty())
    {
    	head = tail = newNode;
    }
    else
    {
    	tail.setNext(newNode);
      tail = newNode;
    }
    ++length;
	}


	public void delete (String phoneNumber) 
{  
    Node current = head;
    Node prev = null;
    boolean exist = true;
    
    if (isEmpty()) 
    {
			System.out.println("The list is empty!");
		} 
    else 
    {
    	while(true)
      {
      	if(current.getPhoneNumber() == phoneNumber)
        	{
          	exist = true;
            break;
          }
          if(current.getNext() == null)
          		break;
          
          prev = current;
          current = current.getNext();
      }
      
      if(exist)
      {
    	  if(length>1)
               	prev.setNext(current.getNext());
    	  
            --length;
      }
      else
      {
      		System.out.println("The phone number does not exist!");

      }
      
    }
}

	public void printList () {

		Node tempNode = head;
		if (head == null) {
			System.out.println("The list is empty!");
		} else {
			for (int i = 0; i < length; i++) {
				System.out.print("Index = " + (i+1) + " ");
				System.out.println(tempNode);
				tempNode = tempNode.getNext();
			}

		}
		System.out.println();
	}

	public boolean isEmpty() {
		return (length == 0);
	}
  
  
  
  public void update(String firstName, String phoneNumber)
  {
   Node current = head;
    boolean exist = true;
    
    if (isEmpty()) 
    {
			System.out.println("The list is empty! no member name matching that name!");
		} 
    else 
    {
    	while(true)
      {
      	if(current.getFirstName() == firstName)
        	{
          	exist = true;
            break;
          }
          if(current.next == null)
          		break;
          
          current = current.getNext();
      }
      
      if(exist)
      {
      	current.setPhoneNumber(phoneNumber);
      }
      else
      {
      		System.out.println("no member name matching that name!");
      }
      
    }
  }
  
  public String searchByFirstName(String firstName)
  {
   Node current = head;
    boolean exist = false ;
    String  fs = "";
    if (isEmpty()) 
    {
			System.out.println("The list is empty! no member name matching that name!");
			return fs;
		} 
    else 
    {
    	while(true)
      {
      	if(current.getFirstName().equals(firstName))
        	{
          	exist = true;
            break;
          }
          if(current.next == null)
          		break;
          
          current = current.getNext();
      }
      
      if(exist)
      {
      	return current.getPhoneNumber();
      }
      else
      {
    	  
      		System.out.println("no member name matching that name!");
      		return fs ;
      }
    }
  }
  
  public void sortList()
  {

      Node current = head, index = null;

      String temp;

      if (head == null) {
          return;
      }
      else {
          while (current != null) {
              
              index = current.getNext();

              while (index != null) {
                  
                  if (current.getFirstName().compareTo(index.getFirstName()) > 0) {
                      temp = current.getFirstName();
                      current.setFirstName(index.getFirstName());
                      index.setFirstName(temp);

                  }

                  index = index.getNext();
              }
              current = current.getNext();
          }
      }
  }
  
  
  
}
