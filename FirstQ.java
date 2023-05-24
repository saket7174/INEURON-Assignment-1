// Sollution of Assignment-1, Question-1,
// ie; "Wap a java program to print "INEURON"."
public class FirstQ {
    public static void main(String[] args) {
        int n = 3;// code for writing "I"
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n / 2 + 1) {
                    System.out.println("*");
                }}}
                //Now , code for writing "N"
System.out.println();
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || j == i)
                    System.out.print("*");
 else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // Now , code for writing "E"
        System.out.println();
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                if ((row == 1 || row == 8 || row == 8 / 2) && col % 2 == 1 || col == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // This is the code for printing "U"
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if ((j == 0 || j == 8) && i < 6 || i == 6 && j % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
// This is the code for printing "R"
        int a = 2;
        boolean m = false;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j == 1 || (i == 1 || i == 10 / 2) && j % 2 == 1 || j == 8 && i < 10 / 2 && i != 1)
                    System.out.print("*");
                else if (i > 10 / 2 && j == a) {
                    System.out.print("*");
                    m = true;
                } else
                    System.out.print(" ");
            }
            System.out.println();
            if (m == true) {
                a++;
            }
        }
        //its the code for printing "O"
     n=6;
    System.out.println();
     for (int w=1;w<=6;w++)
     {
         for (int j=1;j<=n;j++)
         
         {
             if(w==1||w==n||j==1||j==n)
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
     //This is the code for printing "N" Again
        System.out.println();
        for (int i = 1 ;i <=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(j==1||j==7||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    
}
