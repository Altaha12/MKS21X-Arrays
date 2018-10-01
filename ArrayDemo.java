public class ArrayDemo{
public static void printArray(int[]ary){
  String r = "[";
  for(int i=0;i<ary.length;i++){
    r+=ary[i];
    if(!(ary.length-i==1))r+=", ";
  }
  r+="]";
  System.out.println(r);
}
public static void printArray(int[][]ary){
  System.out.println("[");
  for(int i=0;i<ary.length;i++){
    printArray(ary[i]);
  }
  System.out.println("]");
}
public static int countZeros2D(int[][] nums){
  int numzeros=0;
  for(int i=0;i<nums.length;i++){
    for(int k=0; k<nums[i].length;k++){
      if (nums[i][k]==0)numzeros+=1;}  
  }
  return numzeros;
}
public static void main(String[] args){
  int[]x= new int[3];
  x[0]=1;
  int[][]y=new int[2][2];
  y[0][1]=3;
 printArray(x);
 printArray(y);
 System.out.println(countZeros2D(y));
}}
