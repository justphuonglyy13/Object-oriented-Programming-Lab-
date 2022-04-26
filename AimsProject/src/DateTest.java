import java.util.Scanner;
import javax.swing.JOptionPane;

public class DateTest {
	public String accept() {
		String s = JOptionPane.showInputDialog(null, "Please enter the string", "Converter", JOptionPane.INFORMATION_MESSAGE);
		return s;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		
		while(true) {
			System.out.println("=============>>> MY DATE <<<=============");
			System.out.println(" 1. Get current date");
			System.out.println(" 2. Set date using Int variables");
			System.out.println(" 3. Set date using a string");
			System.out.println(" 4. Quit");
			System.out.print("\n  ---> Please enter your choice: ");
			key = sc.nextInt();
			System.out.println();
			
			switch(key) {
				case 1:
					MyDate md1 = new MyDate(); 
					md1.printDate();
					System.out.println();
					break;
				case 2:
					System.out.println(" ??? -> Please enter Date -> Month -> Year: \n");
					System.out.print("Date = ");
					int nd = sc.nextInt();
					while (nd <= 0 || nd > 31) {
						System.out.print("Date = ");
						nd = sc.nextInt(); 
					}
					System.out.print("Month = ");
					int nm = sc.nextInt();
					while (nm <= 0 || nm > 12) {
						System.out.print("Month = ");
						nm = sc.nextInt();
					}
					System.out.print("Year = ");
					int ny = sc.nextInt();
					MyDate md2 = new MyDate(nd, nm, ny);
					System.out.println();
					md2.printDate();
					System.out.println();
					break;
				case 3:
					System.out.println(" ??? -> Please enter the date string with the correct syntax <e.g: January 31st 2022>\n");
					System.out.print("Date = ");
					
					DateTest dt = new DateTest();
					String s = dt.accept();
					MyDate md3 = new MyDate(s);
					md3.printDate();
					System.out.println();
					break;
				case 4:
					System.out.println("Have a good day!");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Wrong choice! Please enter your choice again!!!\n");
					break;
			}	
		}
	}
}
