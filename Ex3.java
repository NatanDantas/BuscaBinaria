public class Ex3{
  public static void main (String[] args){
    int[] v = {3, 7, 2, 10, 5, 4};
    int d1 = difAbs1(v);
    System.out.printf("Dif Abs 1: %d\n", d1);
  }

  //complexidade n
  public static int difAbs(int[]v){
   int min = v[0];
   int max = v[0]; 
    for(int i = 1; i<v.length; i++){
      if(v[i]<min){
        min = v[i];
      }
      if(v[i]>max){
        max = v[i];
      }
    }
    return max - min;
  }

  //complexidade n²
  public static int difAbs1(int[] v){
    int max = 0;
    for(int i = 0; i<v.length; i++){
     for(int j = 0; j<v.length; j++){
        
        int d = Math.abs(v[i]-v[j]);
          if(d>max){
            max=d;
          }
        
      } 
    }
    return max;
  }
}