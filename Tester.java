import java.io.*;
import java.util.*;
import java.util.Random;
public class Tester{
  public static void ran(int[] args){
    Random rando = new Random(100);
    for (int i =0; i<args.length; i++){
      args[i] = rando.nextInt() % 10000;
    }
  }
  public static void main(String[] args){
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {5, 4, 3, 2, 1};
    int[] c = {};
    int[] d = {-7, 100, 5, -9, 0, -1, };
    int[] e = {0, 0, 0, 0, 0};
    int[] f = {9, 10000, 42, 4};
    int[] g = new int[10000];
    ran(g);

    OutSorts.main(a);

    OutSorts.main(b);

    OutSorts.main(c);

    OutSorts.main(d);

    OutSorts.main(e);

    OutSorts.main(f);

    OutSorts.main(g);
    System.out.println("after");
    System.out.println(Arrays.toString(g));



  }

}
