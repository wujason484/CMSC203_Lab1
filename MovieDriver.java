import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String title, rating,check;
		int tickets;

		
		do {
		System.out.println("Enter the name of a movie: ");
		title=keyboard.nextLine();
		
		System.out.println("Enter the rating of the movie: ");
		rating=keyboard.nextLine();
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		tickets=keyboard.nextInt();
		
		Movie m=new Movie(title,rating,tickets);
		
		System.out.println(m);
		System.out.println("Goodbye");
		
		keyboard.nextLine();
		
		System.out.println("Do you want to enter another? (y or n)");
		check=keyboard.nextLine();
		}while(check.equals("y"));
	}
}
