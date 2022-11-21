package numberpattern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
    spiralMatrix(5);
    }
    static void spiralMatrix(int n)
    {
        int m,i,j,a,b;
        m = 2*n-1;
        for (i=0; i<m; i++) {
            for (j=0; j<m; j++) {
                a = (i>=n) ? m-i-1 : i;
                b = (j>=n) ? m-j-1 : j;
                System.out.print(n-((a<b) ? a : b)+"  ");
            }
            System.out.println();
        }
    }
    /*
WAP to print following pattern.
11111
22222
33333
44444
55555
*/
    static void pattern1()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    /*WAP to print the following Pattern.
12345
1234
123
12
1
*/
    static void pattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
22
333
4444
55555
*/
    static void pattern3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
12
123
1234
12345
*/
    static void pattern4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1
*/
    static void pattern5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i%2+" ");
        /*if(i%2!=0)
        System.out.print("1");
        else
        System.out.print("0");*/
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1*/
    static void pattern6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j%2+" ");
        /*if(i%2!=0)
        System.out.print("1");
        else
        System.out.print("0");*/
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
*/
    static void pattern7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
*/
    static void pattern8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
2 3
4 5 6
7 8 9 1
2 3 4 5 6
*/
    static void pattern9(){
        int k=1; //k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                //System.out.print(k%9+1);
                //k++;
                System.out.print(k +" ");
                k++;
                if(k==10)//if(k>9)
                    k=1;
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
*/
    static void pattern10(){
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k%2+" ");
                k++;
                //System.out.print(k);
                //k++
                //if(k>1)
                //k=0;
        /*
        k++;
        if(k%2==0)
        System.out.print("1");
        else
        System.out.print("0");
        //System.out.print(k++ +" ");
        */

            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/
    static void pattern11(){
        int k=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(k%2+" ");
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print following pattern.
 10101
 01010
 10101
 01010
 10101
 */
    static void pattern12(){
        int k = 1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(k);
                if(k==1)
                    k--;
                else
                    k++;
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
   1
  121
 12321
1234321
 12321
  121
   1
*/
    static void pattern13(){
        int n = 7, sp = n/2, ele = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            int k = 1;
            for(int j = 1; j<=ele;j++)
            {
                System.out.print(k+"");
                if(j<=ele/2)
                    k++;
                else
                    k--;
            }
            if(i<=n/2)
            {
                sp--;
                ele = ele+2;
            }
            else
            {
                sp++;
                ele = ele-2;
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
   1
  212
 32123
4321234
 32123
  212
   1
*/
    static void pattern14(){
        int n = 7, sp = n/2, ele = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            int k = (ele/2)+1;
            for(int j = 1; j<=ele;j++)
            {
                System.out.print(k+"");
                if(j<=ele/2)
                    k--;
                else
                    k++;
            }
            if(i<=n/2)
            {
                sp--;
                ele = ele+2;
            }
            else
            {
                sp++;
                ele = ele-2;
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
    static void pattern15(int n){
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
WAP to print the following pattern.
 12345
 12345
 12345
 12345
 12345
 */
    static void pattern16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
1*3*5
1*3*5
1*3*5
1*3*5
1*3*5
 */
    static void pattern17(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            k = 1;
            for(int j=1;j<=n;j++)
            {
                if(j%2==0)
                    System.out.print("*");
                else
                    System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
 1*2*3
 1*2*3
 1*2*3
 1*2*3
 1*2*3
*/
    static void pattern18(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            k = 1;
            for(int j=1;j<=n;j++)
            {
                if(j%2==1)
                {
                    System.out.print(k);
                    k++;
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
12345
 1234
  123
   12
    1
*/
    static void pattern19(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    1
   12
  123
 1234
12345
*/
    static void pattern20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    1
   22
  333
 4444
55555
*/
    static void pattern21(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    1
   123
  12345
 1234567
123456789
 */
    static void pattern22(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            k=1;
            //for(int j=1;j<=n-i;j++)
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print following pattern.
 10101
 01010
 10101
 01010
 10101
 */
    static void pattern23()
    {
        int i, j, n=5, k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(k%2);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
    1
   101
  10101
 1010101
101010101
 */
    static void pattern24()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            k=1;
            //for(int j=1;j<=n-i;j++)
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {

                System.out.print(k%2);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
     1
    1*2
   1*2*3
  1*2*3*4
 1*2*3*4*5
 */
    static void pattern25()
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
            k=1;
            for(int j=1;j<=2*i-1;j++)
            {
                if(j%2==1)
                    System.out.print(k++);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
   1
  1*2
 1*2*3
1*2*3*4
 1*2*3
  1*2
   1
*/
    static void pattern26()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int s = n/2, k = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            int l=1;
            for(int j=1; j<=k;j++)
            {
                if(j%2==0)
                    System.out.print("*");
                else
                {
                    System.out.print(l);
                    l++;
                }
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
    /*
WAP to print the following pattern.
1234321
 12321
  121
   1
  121
 12321
1234321
*/
    static void pattern27()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k,s=n,sp=0; //s = star, sp = space
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            k=1;
            for(int j=1;j<=s;j++)
            {
                System.out.print(k);
                if(j<=s/2)
                    k++;
                else
                    k--;
            }
            if(i<=n/2)
            {
                s=s-2;
                sp++;
            }
            else
            {
                s=s+2;
                sp--;
            }
            System.out.println();
        }
    }
    /*WAP to print following Pattern.
   1
  101
 10101
1010101
 10101
  101
   1
*/
    static void pattern28()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int s = n/2, k = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            int l=1;
            for(int j=1; j<=k;j++)
            {
                System.out.print(l%2);
                l++;
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
   1
  222
 33333
4444444
 33333
  222
   1
*/
    static void pattern29()
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
                System.out.print(l);
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
    /*
WAP to print the following pattern.
    1
   010
  10101
 0101010
101010101
 */
    static void pattern30()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k=1;
        for(int i=1;i<=n;i++)
        {
            //for(j=n;j>i;j--)
            //for(int j=1;j<=n-i;j++)
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {

                System.out.print(k%2);
                k++;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
1
2 5
3 6 8
4 7 9 10
*/
    static void pattern31()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k;
        for(int i=1;i<=n;i++)
        {
            k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k+n-j;
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
1
3  2
6  5  4
10 9  8  7
*/
    static void pattern32()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Pattern is : ");
        int k=1,l=2,m=1;
        for(int i=1;i<=n;i++)
        {
            m=k;
            for(int j=1;j<=i;j++)
            {
                System.out.print(m+" ");
                m--;
            }
            k=k+l;
            l++;
            System.out.println();
        }
    }
/*
WAP to print the following pattern
 00000
 11111
 00000
 11111
 00000
 */
    static void pattern33()
    {
        int i,j, n=5;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(i%2);
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
 12345
 67891
 23456
 78912
 34567
 */
    static void pattern34()
    {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(k);
                k++;
                if(k>9)
                {
                    k=1;
                }
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
1*1*1
1*1*1
1*1*1
1*1*1
1*1*1
*/
    static void pattern35()
    {
        int i,j,n=5,k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j%2==1)
                    System.out.print("1");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
/*
WAP to print the following pattern.
1*1*1
0*0*0
1*1*1
0*0*0
1*1*1
*/
    static void pattern36()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                for(j=1;j<=n;j++)
                {
                    if(j%2==1)
                        System.out.print("0");
                    else
                        System.out.print("*");
                }
            }
            else
            {
                for(j=1;j<=n;j++)
                {
                    if(j%2==1)
                        System.out.print("1");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    /*
WAP to print the following pattern.
 1*0*1
 1*0*1
 1*0*1
 1*0*1
 */
    static void pattern37()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j%2==0)
                    System.out.print("*");
                else if(j==3)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
    static void uniquePartition( int n)
    {
        int[] p = new int[n];
        int k = 0;
        p[k] = n;
        while (true)
        {
            printArray(p, k+1);
            int rem_val = 0;
            while (k >= 0 && p[k] == 1)
            {
                rem_val += p[k];
                k--;
            }
            if (k < 0)  return;
            p[k]--;
            rem_val++;
            while (rem_val > p[k])
            {
                p[k+1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }
            p[k+1] = rem_val;
            k++;
        }
    }
    static void printArray(int p[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(p[i]+" ");
        System.out.println();
    }
    class Solution {
        public int nearestExit(char[][] maze, int[] entrance) {
            int rows = maze.length, cols = maze[0].length;
            int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            // Mark the entrance as visited since its not a exit.
            int startRow = entrance[0], startCol = entrance[1];
            maze[startRow][startCol] = '+';

            // Start BFS from the entrance, and use a queue `queue` to store all
            // the cells to be visited.
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{startRow, startCol, 0});

            while (!queue.isEmpty()) {
                int[] currState = queue.poll();
                int currRow = currState[0], currCol = currState[1], currDistance = currState[2];

                // For the current cell, check its four neighbor cells.
                for (int[] dir : dirs) {
                    int nextRow = currRow + dir[0], nextCol = currCol + dir[1];

                    // If there exists an unvisited empty neighbor:
                    if (0 <= nextRow && nextRow < rows && 0 <= nextCol && nextCol < cols
                            && maze[nextRow][nextCol] == '.') {

                        // If this empty cell is an exit, return distance + 1.
                        if (nextRow == 0 || nextRow == rows - 1 || nextCol == 0 || nextCol == cols - 1)
                            return currDistance + 1;

                        // Otherwise, add this cell to 'queue' and mark it as visited.
                        maze[nextRow][nextCol] = '+';
                        queue.offer(new int[]{nextRow, nextCol, currDistance + 1});
                    }
                }
            }

            // If we finish iterating without finding an exit, return -1.
            return -1;
        }
    }
}
