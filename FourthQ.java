//Sollution of Assignment-1, Question-4,
// ie; "Wap a java program to print the given pattern
public class FourthQ {
    public static void main(String[] args) {
        int n=5;
        for (int i =1;i<=n;i++)
        {
            for (int j =1;j<=n*2;j++)
            {
                if (j<=i||j>=n*2-i)
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
