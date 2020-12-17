import java.util.Random;
import java.io.*;
import java.util.*;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static int miniSort(int[] data){
    int x = 0;
    for ( int i = 0; i < data.length-1; i++){
      int a = 0;
      if (data[i]>data[i+1]){
        a = data[i+1];
        data[i+1] = data[i];
        data[i] = a;
        x++;
      }
    }
    return x;
  }
  public static void bubbleSort(int[] data){

    for (int i = 0; i<data.length; i++){
      if (miniSort(data) == 0){
        break;
      }
      else{
        miniSort(data);

      }
    }
    
  }
}
