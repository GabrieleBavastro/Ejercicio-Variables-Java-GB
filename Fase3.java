public class Fase3 {
	  public static void main(String[] args) {
	boolean b1 = true;
	boolean b2 = false;	
	int leapYearReference = 1948;
	int yearOfBirth = 1984;
	int leapYearloop = 4;
    for (int i = leapYearReference; i <= yearOfBirth; i = i + leapYearloop)
			{
		if (i == yearOfBirth) {System.out.println(yearOfBirth + " it's your birthday and it's a leap year - " + b1);}
		else {System.out.println(i + " or " + yearOfBirth + " it's your birthday and it's a leap year - " + b2);}
		}
	}  
  }