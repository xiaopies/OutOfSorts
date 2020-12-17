import java.io.*;
import java.util.*;
import java.util.Random;
public class Tester{
  public static void main(String[] args){
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {5, 4, 3, 2, 1};
    int[] c = {};
    int[] d = {-7, 100, 5, -9, 0, -1, };
    int[] e = {0, 0, 0, 0, 0};
    int[] f = {9, 10000, 42, 4};

    OutSorts.main(a);
    System.out.println(Arrays.toString(a));
    OutSorts.main(b);
    System.out.println(Arrays.toString(b));
    OutSorts.main(c);
    System.out.println(Arrays.toString(c));
    OutSorts.main(d);
    System.out.println(Arrays.toString(d));
    OutSorts.main(e);
    System.out.println(Arrays.toString(e));
    OutSorts.main(f);
    System.out.println(Arrays.toString(f));
  }

}
