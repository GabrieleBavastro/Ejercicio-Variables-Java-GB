public class Fase3 {
	  public static void main(String[] args) {
	boolean b1 = true;
	boolean b2 = false;	
	String stringBooleanTrue = " it's your birthday and it's a leap year - true";
	String stringBooleanFalse = " it's your birthday and it's a leap year - false";
	int leapYearReference = 1948;
	int yearOfBirth = 1984;
	int leapYearloop = 4;
    for (int i = leapYearReference; i <= yearOfBirth; i = i + leapYearloop)
			{
		if (i == yearOfBirth) {System.out.println(yearOfBirth + stringBooleanTrue);}
		else {System.out.println(i + stringBooleanFalse);}
		}
	}  
  }