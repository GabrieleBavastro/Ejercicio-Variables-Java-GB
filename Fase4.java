public class Fase4 {
   public static void main(String[] args) {
	String name = "Gabriele";
	String surname1 = "Bavastro";
	String surname2 = "Navone";
	String stringBooleanTrue = " it's your birthday and it's a leap year - true";
	String stringBooleanFalse = " it's your birthday and it's a leap year - false";	
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
	if (i == yearOfBirth) {System.out.println(yearOfBirth + stringBooleanTrue);}
	else {System.out.println(i + stringBooleanFalse);}
	   }
}
}