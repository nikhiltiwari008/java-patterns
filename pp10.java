public class pp10 {
    
    public static void main(String[] args) {
        int i,j,n=4;
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

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
