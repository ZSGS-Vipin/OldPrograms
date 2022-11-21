package alphabetpattern;

import java.util.Scanner;

/*
WAP to print the following pattern.
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 */
public class AlphabetPattern {
    public static void main(String[] args) {
        pattern16();
    }
    /*
    WAP to print the following pattern.
 AAAAA
 BBBBB
 CCCCC
 DDDDD
 EEEEE
 */
public static void pattern1()
{
    int i, j, k, n = 5;
    for (i = 1; i <= n; i++) {
        k = 65;
        for (j = 1; j <= n; j++) {
            System.out.print((char) k);
            k++;
        }
        System.out.println();
    }
}
/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
 */
    public static void pattern2() {
        int i, j, k = 65, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print((char) k);
            }
            System.out.println();
            k++;
        }
    }
/*
    A
   BCD
  EFGHI
 JKLMNOP
QRSTUVWXY
 */
    public static void pattern3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) (k + 64));
                k++;
                if (k == 27)
                    k = 1;
            }
            System.out.println();
        }
    }

    /*
WAP to print the following pattern.
A B C D E
 A B C D
  A B C
   A B
    A
   A B
  A B C
 A B C D
A B C D E
*/
    public static void pattern4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k = 1, s = (n / 2) + 1, sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            if (i <= n / 2) {
                s--;
                sp++;
            } else {
                s++;
                sp--;
            }
            System.out.println();
        }
    }
    /*
    WAP to print the following pattern.
    ABCDE
     ABCD
      ABC
       AB
        A
       AB
      ABC
     ABCD
    ABCDE
    */
    public static void pattern5() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int n = sc.nextInt();
            System.out.println("The Pattern is : ");
            int k = 1, s = (n / 2) + 1, sp = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= s; j++) {
                    System.out.print((char) (j + 64));
                }
                if (i <= n / 2) {
                    s--;
                    sp++;
                } else {
                    s++;
                    sp--;
                }
                System.out.println();
            }
        }
    /*
WAP to print the following pattern.
ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE
*/
        public static void pattern6()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int n = sc.nextInt();
            System.out.println("The Pattern is : ");
            int k=1,s=(n/2)+1,sp=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=sp;j++)
                {
                    System.out.print("");
                }
                for(int j=1;j<=s;j++)
                {
                    System.out.print((char)(j+64));
                }
                if(i<=n/2)
                {
                    s--;
                    sp++;
                }
                else
                {
                    s++;
                    sp--;
                }
                System.out.println();
            }
        }
    /*WAP to print following Pattern.
A
ABC
ABCDE
ABCDEFG
ABCDE
ABC
A
*/
        public static void pattern7()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int n = sc.nextInt();
            System.out.println("The Pattern is : ");
            int s=n/2, k=1,l=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=s;j++)
                {
                    System.out.print(" ");
                }
                l=1;
                for(int j=1; j<=k;j++)
                {
                    System.out.print((char)(j+l+63));
                }
                if(i<=n/2)
                {
                    s--;
                    k=k+2;
                }
                else
                {
                    s++;
                    k=k-2;
                }
                System.out.println();
            }
        }
        /*WAP to print following Pattern.
   A
  BBB
 CCCCC
DDDDDDD
 CCCCC
  BBB
   A
*/
    public static void pattern8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int s=n/2, k=1,l=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=k;j++)
            {
                System.out.print((char)(l+64));
            }
            if(i<=n/2)
            {
                s--;
                l++;
                k=k+2;
            }
            else
            {
                s++;
                l--;
                k=k-2;
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
   A
  ABA
 ABCBA
ABCDCBA
 ABCBA
  ABA
   A
*/
    public static void pattern9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int s=n/2, k=1,l=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            l=1;
            for(int j=1; j<=k;j++)
            {
                System.out.print((char)(l+64));
                if(j<=k/2)
                    l++;
                else
                    l--;
            }
            if(i<=n/2)
            {
                s--;
                k=k+2;
            }
            else
            {
                s++;
                k=k-2;
            }
            System.out.println();
        }
    }
    /*WAP to print the following pattern.
 ABCDE
 FGHIJ
 KLMNO
 PQRST
 UVWXY
 */
    public static void pattern10()
    {
        int i,j,k=65,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print following pattern.
 A
 AB
 ABC
 ABCD
 ABCDE
 */
    public static void pattern11()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
 A
 BC
 DEF
 GHIJ
 KLMNO
 */
    public static void pattern12()
    {
        int n=5,k=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/
    public static void pattern13()
    {
        int n=6,k;
        for(int i=1;i<=n;i++)
        {
            k=64;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+k));
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    A
   BC
  DEF
 GHIJ
KLMNO
*/
public static void pattern14()
{
    int n=5,k=65;
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j<n;j++)
        //for(int j=0;j<n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print((char)k);
            k++;
        }
        System.out.println();
    }
}
/*
WAP to print the following pattern.
    A
   AB
  ABC
 ACBD
ABCDE
*/
    public static void pattern15()
    {
        int n=5,k;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            k=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
     A
    BC
   CDE
  DEFG
 EFGHI
 */
    public static void pattern16()
    {
        int n=5,k;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            k=64;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(k+i));
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 */
    public static void pattern17()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            //for(int j=1;j<=n-i;j++)
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }

    }