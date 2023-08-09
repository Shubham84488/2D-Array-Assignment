public class Q3Diagonals {
    public static void main(String[] args) {
        //int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
