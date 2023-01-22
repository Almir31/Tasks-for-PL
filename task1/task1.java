public class task1 {
    public static void main(String [] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int [][] intervals = new int [n][m];
        int a=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                intervals[i][j] = a;
                a++;
                if (a==(n+1)){
                    a=1;
                }
            }
            if (intervals[i][m-1]!=1){
                a=intervals[i][m-1];
            }
            else break;
        }

        for (int i=0; i<n; i++){
            if(intervals [i][0]!=0){
                System.out.print(intervals[i][0]);
            }
            else break;
        }

    }
}

