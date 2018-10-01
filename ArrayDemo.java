public class ArrayDemo{
public static void printArray(int[]ary)/*0a*/{
  String r = "[";
  for(int i=0;i<ary.length;i++){
    r+=ary[i];
    if(!(ary.length-i==1))r+=", ";
  }
  r+="]";
  System.out.println(r);
}
public static void printArray(int[][]ary)/*0b*/{
  System.out.println("[");
  for(int i=0;i<ary.length;i++){
    printArray(ary[i]);
  }
  System.out.println("]");
}
public static int countZeros2D(int[][] nums)/*1*/{
  int numzeros=0;
  for(int i=0;i<nums.length;i++){
    for(int k=0; k<nums[i].length;k++){
      if (nums[i][k]==0)numzeros+=1;}
  }
  return numzeros;
}
public static void fill2D(int[][] vals)/*2a*/{
  for(int i=0;i<vals.length;i++){
    for(int k=0;k<vals[i].length;k++){
      vals[i][k]=1;
      if(i==k)vals[i][k]=3;
    }
  }
}
public static int[][] fill2DCopy(int[][] vals)/*2b*/{
  int[][]valscopy= new int[vals.length][vals[0].length];
  for(int i=0;i<vals.length;i++){
    for(int k=0;k<vals[i].length;k++){
      valscopy[i][k]=1;
      if(vals[i][k]<0)valscopy[i][k]=3;
    }}
  return valscopy;
  }
public static void main(String[] args)/**/{
  int[]x= new int[3];
  x[0]=1;
  int[][]y=new int[2][2];
  y[0][1]=3;
 printArray(x);
 printArray(y);
 System.out.println(countZeros2D(y));
 fill2D(y);
 printArray(y);
 y[0][0]=-4;
 printArray(fill2DCopy(y));
 System.out.println(countZeros2D(y));
}}
