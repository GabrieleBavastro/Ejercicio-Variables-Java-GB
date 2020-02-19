public class Fase4 {
   public static void main(String[] args) {
	String name = "Gabriele";
	String surname1 = "Bavastro";
	String surname2 = "Navone"; 
	String stringBooleanTrue = "Your birthday and it's a leap year - true.";
	String stringBooleanFalse = "Your birthday and it's a leap year - false.";	
	int yearOfBirth = 1984;
	int day = 9;
	int month = 7;
		String fullName = surname1 + " " + surname2 + " " + name;
		System.out.println("Full Name: "+ fullName);
		System.out.println("Birthday: "+ day + "/" + (month) + "/" + yearOfBirth);
		
	switch (yearOfBirth) {
  case (1948 + 4):
    System.out.println(stringBooleanTrue);
    break;
  case (1948 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  case (1948 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4):
	    System.out.println(stringBooleanTrue);
	    break;
  default:
	    System.out.println(stringBooleanFalse);
}
	
	   
}
}