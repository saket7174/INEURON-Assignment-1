//Sollution of Assignment-1, Question-3,
// wap java program to print the given pattern
public class ThirdQ {
    public static void main(String[] args) {
        int i,j;
        int n= 9;
        int c1 = (n-1)/2;
        int c2 = 3*n/2-1;
        for (i=0;i<n;i++)
        {
          for (j=0;j<n;j++)
          {
            if (i+j<=c1||i-j>=c1||j-i>=c1||i+j>=c2)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
          }  
          System.out.println();
        }
    }
}
