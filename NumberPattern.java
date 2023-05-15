package Doubts;

public class NumberPattern {
    public static void main(String[] args) {
        int r=3;
        int p=1;
        for (int i=1;i<=r;i++,p++){
            for (int j=1;j<=r;j++){
                if (i==j){
                    System.out.print(p+" ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int k=i;k<r;k++){
                if (k==r-1){
                    System.out.print(p+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=1;i<r;i++,p++){
            for (int j=1;j<r;j++){
                if (j==i) {
                    System.out.print("  ");
                } else {
                    System.out.print(p+" ");
                }
            }
            for (int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                if (l==1){
                    System.out.print(p+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
