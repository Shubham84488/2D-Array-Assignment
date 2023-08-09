import java.util.Scanner;

public class Q1Printing{
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m=sc.nextInt();    
        System.out.print("enter the number of column : ");    
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        
        int i,j;    
           
        System.out.println("enter the  matrix element : ");    
        for(i=0;i<m;i++){    
            for(j=0;j<n;j++){    
                arr[i][j]=sc.nextInt();  
            }    
        }

        int positive=0,negative=0,odd=0,even=0,zero=0;

        for (int k1 = 0; k1< arr.length; k1++) {
            for (int k2 = 0; k2 < arr.length; k2++) {
                //For positive,negative,zero elements
                if(arr[k1][k2]>0){
                    positive++;
                }
                else if(arr[k1][k2]<0){
                    negative++;
                }
                else if(arr[k1][k2]==0){
                    zero++;
                }

                //for even and odd
                if(arr[k1][k2]%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }

        System.out.printf("positive: %d \nnegative: %d \nzero: %d\neven: %d\nodd: %d ", 
        positive,negative,zero,even,odd);

    }
}