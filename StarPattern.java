package starpattern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

    }
    /* WAP to draw this pattern.
     *****
     *****
     *****
     *****
     *****
     */
    static void pattern1(){
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
    static void pattern2(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1;j<=i;j++){
                if(j<i)
                    System.out.print(i+"*");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                if(j<i)
                    System.out.print(i+"*");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
    /*
WAP to print following pattern.
 *
 ***
 *****
 *******
 *********
 */
    static void pattern3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            //for(int j=1;j<=2*i-1;j++)
            for(int j=1;j<(2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    *
   **
  ***
 ****
*****
*/
    static void pattern4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k=0;
        for(int i=1;i<=n;i++)
        {
            //for(int j=1;j<=n-i;j++)
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
     *
    ***
   *****
  *******
 *********
 */
    static void pattern5(){

    }
    static void pattern6(){

    }
    static void pattern7(){

    }
    static void pattern8(){

    }
    static void pattern9(){

    }
    static void pattern10(){

    }
    static void pattern11(){

    }
    static void pattern12(){

    }
    static void pattern13(){

    }
    static void pattern14(){

    }
    static void pattern15(){

    }
    static void pattern16(){

    }
    static void pattern17(){

    }
    static void pattern18(){

    }
    static void pattern19(){

    }
    static void pattern20(){

    }
    static void pattern21(){

    }
    static void pattern22(){

    }
    static void pattern23(){

    }
    static void pattern24(){

    }
    static void pattern25(){

    }
    static void pattern26(){

    }
    static void pattern27(){

    }
    static void pattern28(){

    }
    static void pattern29(){

    }
    static void pattern30(){

    }
    static void pattern31(){

    }
}
