import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args){
        //从键盘接受6个整型数据，求这组数据的最大和最小值
        //判断某数据在数组中第一次出现的位置（包含这个数据的输出位置，否则提示不存在）

        Scanner scanner=new Scanner(System.in);
        int[] num=new int[6];
        for (int i=0;i<6;i++){
            System.out.println("请输出一个整数");
            int num1=scanner.nextInt();
            num[i]=num1;
        }
        int mix=num[0];
        int min=num[0];
        for (int arr:num){
            if (mix<arr){
                mix=arr;
            }

            if (min>arr){
                min=arr;
            }
        }
        System.out.println("最大值为"+mix);
        System.out.println("最小值为"+min);




    }
}
