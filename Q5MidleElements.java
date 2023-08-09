import java.util.Scanner;

public class Q5MidleElements{

    public static void findMiddle(int arr[][]) {
        int m=arr.length;
        int n =arr[0].length;
        int mid =m/2; 
        
        for (int i = 0; i <m;i++) {
            System.out.print(arr[i][mid]+" ");
        }
        for (int j = 0; j <n; j++) {
            if(j==mid)continue;
            System.out.print(arr[mid][j]+" ");          
        }
        
    }

    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m=sc.nextInt();    
        System.out.print("enter the number of column : ");    
        n=sc.nextInt();
        int arr[][]=new int[m][n];    
           
        System.out.println("enter the  matrix element : ");    
        for(int i=0;i<m;i++){    
            for(int j=0;j<n;j++){    
                arr[i][j]=sc.nextInt();  
            }    
        }
        sc.close();

        findMiddle(arr);

    }
}