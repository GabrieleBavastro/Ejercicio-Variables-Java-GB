public class Fase4 {
   public static void main(String[] args) {
	String name = "Gabriele";
	String surname1 = "Bavastro";
	String surname2 = "Navone";
	boolean b1 = true;
	boolean b2 = false;	
	int leapYearReference = 1948;
	int yearOfBirth = 1984;
	int leapYearloop = 4;
	int day = 9;
	int month = 7;
		String fullName = surname1 + " " + surname2 + " " + name;
		System.out.println("Full Name: "+ fullName);
		System.out.println("Birthday: "+ day + "/" + (month) + "/" + yearOfBirth);
		
	for (int i = leapYearReference; i <= yearOfBirth; i = i + leapYearloop)	
	{		
	if (i == yearOfBirth) {System.out.println("Your birthday it's a leap year - " + b1);}
	else if (i < yearOfBirth) {System.out.println("Your birthday it's a leap year - " + b2);}
	else {System.out.println("Your birthday it's a leap year - " + b2);}
   }
}
}