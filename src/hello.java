/*public class hello
{


    public static void main (String[] args)
    {
        System.out.println("hello");
    }
}
************************************/

/*import java.util.Scanner;
class Num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no.:");
        int a=sc.nextInt();
        System.out.print("enter second no.:");
        int b=sc.nextInt();
        System.out.println("sum="+(a+b));
        sc.close();


    }

}
****************************************/
/*import java.util.Scanner;
 class emp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name: ");
        String name=sc.nextLine();
        System.out.println("enter age: ");
        int age=sc.nextInt();

        System.out.println("hello "+name);
        System.out.println("your age is "+age);
        sc.close();

    }
}
***************************************************/


/*import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.:");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        sc.close();
    }
}
************************************/

/*class Num
{
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);

        }
    }



}
***************************************/
/*class Num {
    public static void main(String[] args) {
        int i=1;
        while (i<=5)
        {
            System.out.println(i);
        i++;
    }

}

}
*************************************************/

/*class Num {
    public static void main(String [] args)
    {
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }while(i<=10);

    }

}
*********************************************/
class Animal
{
    void eat()
    {
        System.out.println("eating");

    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking");
    }
}

