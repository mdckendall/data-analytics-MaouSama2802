import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		
    Scanner input = new Scanner(System.in);
		int i=0;
   
    do{
      System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the jobs.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
      i = input.nextInt();
      if(i==1){
        System.out.println("$98,345 is the salary in South Florida!");
      }
      else if(i==2){
        System.out.println("US News - 100 Best Jobs!");
      }
      else if(i==3){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      else if(i==4){
        System.out.println("Current Students:");
        try{
      FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
       while(fileScanner.hasNextLine()){
            String names = fileScanner.nextLine();
            System.out.println(names);
          }
          fileScanner.close();
        }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        }
       }while(i!=5);
  
	}
}