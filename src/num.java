/*public class num               //largest of 3 no.s
{
    public static void main(String[] args)
    {   int a=10,b=23,c=2;
        if(a>=b && a>=c)
        {
            System.out.println("largest = "+a);
        }
        if(b>=a && b>=c)
        {
            System.out.println("largest = "+b);
        }
        else
            System.out.println("largest = "+c);

    }
}*/

/*public class num          //factorial
{
    public static void main(String[] args)
    {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial = "+fact);
    }
}*/


/*public class num         //reverse of a no.
{
    public static void main(String[] args)
    {
        int n=6789;
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("reverse= "+rev);
    }

}*/

public class num           //multiplication table
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + "x" + i + "=" + (n * i));
        }
    }
}

