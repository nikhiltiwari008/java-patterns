public class pp7 {
    
    public static void main(String[] args) {
        int i,j,n=4;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(i=1; i<=n; i++)
        {
            for(j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
