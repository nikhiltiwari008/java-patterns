public class pp8 {
    
    public static void main(String[] args) {
        int i,j,n=4;
        for(i=1; i<=n; i++)
        {
            for(j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
            System.out.print("*");
            }
            System.out.println("");
        }
            //int i,j,n=4;
            for(i=1; i<=n; i++)
            {
                for(j=1; j<=i; j++)
                {
                    System.out.print(" ");
                }
                for(int k=i; k<=n; k++)
                {
                System.out.print("*");
                }
                System.out.println("");

            }

        }
    }

