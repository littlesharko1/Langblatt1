package Blatt2;
import java.util.Scanner;
import java.util.ArrayList;

public class Quicksort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

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

    for(int i = 0; i < output.length; i++){
      output[i] = list.get(i);
    }
  }

  public static int partition(int[] data, int l, int r) {
    int temp;
    int m;
    int p = data[0];
    try{
      
    } catch(ArrayIndexOutOfBoundsException) {

    }

    return m;
  }

  public static int[] qSort(int[] data, int l, int r) {

  } 

  public static int[] qSort(int[] data) {

  }

  public static boolean isSorted(int[] data) {

  }

}
