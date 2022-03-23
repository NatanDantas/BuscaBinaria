public class Ex4{
  public static void main(String[] args){
    //int [] v = {5, 10, 3, 2, 4, 7, 9, 8, 5};
    int[] v = {1, 2, 3, 4, 5, 6, 7, 8};
    int c = comprimento(v);
    System.out.printf("Comprimento: %d\n", c);
  }

  public static int comprimento(int[] v){
    int max = 1;
    int cont = 1;

    for(int i = 0; i<v.length-1; i++){
      if(v[i]<v[i+1]){
        cont ++;
      }else{
        if(cont > max){
          max = cont;
          
        }
        cont = 1; 
      }
    }
    if(cont>max){
      max = cont;
    }
    return max;
  }
}