public class Fase3 {
	  public static void main(String[] args) {
	int leapYearReference = 1948;
	int yearOfBirth = 1984;
	int leapYearloop = 4;
    for (int i = leapYearReference; i <= yearOfBirth; i = i + leapYearloop) {
    if (i == yearOfBirth) System.out.println("You born in " + i + " and it's a leap year");
	else if (i == yearOfBirth) System.out.println("You born in " + i + " and it's not a leap year");
	}  
  }
}