import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int lens = nums.length;
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num = num2 - num1;
            if(num <= 1){
                System.out.println(-1 + " " + -1);
            }else {
                for(int j = 0; j < lens; j++){
                    if(num % nums[j] == 0){
                        System.out.println(nums[j] + " " + num / nums[j]);
                        break;
                    }
                    if(j >=lens)
                        System.out.println(-1 + " " + -1);
                }
            }
        }

    }
}
