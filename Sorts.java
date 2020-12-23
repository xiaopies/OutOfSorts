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
  public static void selectionSort(int[] data){

      for (int i = 0; i<data.length; i++){
        int check = -1;
        int a = data[i];
        int place = 0;
        int small = data[i];
        for (int j=i; j<data.length; j++){
          if (j !=0 && data[j]<data[j-1]){
            check ++;
          }
          if (data[j]<small){
            small = data[j];
            place =j;
          }
        }
        if (check == -1){
          break;
        }
        if (place != 0){
          data[place] = a;
          data[i] = small;
        }
        System.out.println(Arrays.toString(data));
      }
    }
    public static void insertionSort(int[] data){
      for (int i =1; i<data.length; i++){
        System.out.println(data[i] + "hi");
        int current = data[i];
        for (int j =i; j>0; j--){
          if (data[j-1]>current){
            int sandwich = data[j];
            data[j] = data[j-1];
            data[j-1] = sandwich;
            System.out.println(Arrays.toString(data));
          }
        }
      }
    }

//time java Driver 2000 bubble
}
