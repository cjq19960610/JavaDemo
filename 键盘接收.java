import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args){
        /*
            1.从键盘接收五个学生的姓名，并且将其输出
            2.从键盘接收5个数字，接收完毕之后，求这些数字的和与平均值
         */

        String[] names=new String[5];
        Scanner arr=new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("请输入学生");
            String stuname=arr.next();
            names[i]=stuname;
        }
        System.out.println(Arrays.toString(names));

        Scanner scanner=new Scanner(System.in);
        int[] arr1=new int[5];
        for (int a=0;a<5;a++){
            System.out.println("请输入数字");
            int num=scanner.nextInt();
            arr1[a]=num;
        }


    }
}
