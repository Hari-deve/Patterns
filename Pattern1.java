package Doubts;

public class Pattern1 {
    public static void main(String[] args) {
        int r = 5;
       //   Increasing Triangle
       for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Decreasing triangle
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <=r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Right sided increasing
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <=r; j++) {
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right side Increasing
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int k=i;k<=r;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Equilateral Triangle
        for (int i=1;i<=r;i++){
            for (int j=i;j<r;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Equilateral Triangle
        for (int i=1;i<=r;i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int k=i;k<r;k++){
                System.out.print("* ");
            }
            for (int l=i;l<=r;l++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Diamond Pattern
        for (int i = 1; i < r; i++) {
            for (int j =i; j <r; j++) {
                System.out.print("  ");
            }
            for (int k=1;k<i;k++){
                System.out.print("* ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= r; i++) {
            for (int j =1; j <i; j++) {
                System.out.print("  ");
            }
            for (int k=i;k<r;k++){
                System.out.print("* ");
            }
            for (int l=i;l<=r;l++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
