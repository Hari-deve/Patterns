package Doubts;

public class Assignment {
    public static void main(String[] args) {
        int s=3;

        for (int i=1;i<s;i++){
            for (int j=1;j<s;j++){
                if (j==i){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int k=i;k<s;k++){
                System.out.print("  ");
            }
            for (int l=i;l<=s;l++){
                if (l==i){
                    System.out.print(l+"");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        for (int i=1,p=s;i<=s;i++,p++){
            for (int j=i;j<s;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                if (k==1){
                    System.out.print(p+" ");
                }else{
                    System.out.print(" ");
                }
            }
            for (int l=1;l<=i;l++){
                if (i==1){
                    System.out.print("");
                } else if (l==i) {
                    System.out.print(p+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
