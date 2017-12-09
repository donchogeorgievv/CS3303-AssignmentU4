import java.util.Scanner;

public class MyBST {

	public static void main(String[] args) {
		
			Scanner inputReader = new Scanner(System.in);
			System.out.print("Enter the number of integers: ");
			int numberOfIntegers = inputReader.nextInt();
			BSTTree tree = new BSTTree();
			
			for(int i = 0; i < numberOfIntegers; i++) {
				System.out.print("Enter the integer on poistion " + i + ": ");
				int temp = inputReader.nextInt();
				tree.Insert(temp);
			}
			
			System.out.print("Enter a value to search for: ");
			int valueToSearch = inputReader.nextInt();
			int steps = tree.FindItem(valueToSearch);
			if(steps == -1) {
				System.out.println("Value not found!");
			}
			else {
				System.out.println("Value found after " + steps + " itterations");
			}
			
			inputReader.close();
		}
	

}




