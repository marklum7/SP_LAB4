import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[]nums=new int[15];
        for (int i=0; i<nums.length;i++){
            nums[i]= 0;
        }
        Scanner in = new Scanner(System.in);
        int col_gs= in.nextInt();
        for (int i=0;i<col_gs;i++){
            nums[in.nextInt()-1]+=1;
        }

        int max=0;
        int col=0;

        for (int j =0;j<3;j++){
            max=0;
            col=0;
            for(int i =0;i<nums.length;i++){
                if (nums[i]>col){
                    col = nums[i];
                    max = i+1;
                }
            }
            System.out.println(max);
            System.out.println(col);
            nums[max - 1]=0;
        }
    }
}
