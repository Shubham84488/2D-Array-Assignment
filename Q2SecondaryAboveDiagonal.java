public class Q2SecondaryAboveDiagonal{
    public static void main(String[] args) {
        //int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m-1;i++){
            for (int j = 0; j <n-1-i; j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

    }
}