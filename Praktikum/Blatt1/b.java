import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class b {
  public static void main(String[] args)  {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    while(input.hasNextLine()) { //guckt ob noch eine Eingabe erhältich ist 
      try {
        int val = Integer.parseInt(input.nextLine());
        list.add(val);
      }
      catch(NumberFormatException e) {
        System.err.println("Input contains non-Integer");
      }
    }
    
    int[] output = new int[list.size()];
    
    int count = 0;
    for(int a : list) {
      output[count] = a;
      count++;
    }
    
    System.out.println(Arrays.toString(output));
    
    //  c)

    Arrays.sort(output);

    int k = Integer.parseInt(args[0]);

    System.out.println(output[k-1]);
  }
}