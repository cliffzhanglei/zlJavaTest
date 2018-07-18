package imooc;
import java.util.Arrays;

public class HelloWorld {
    
    //完成 main 方法
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
        System.out.println("考试成绩的前三名为：");
        hello.topThree(scores);
        
        
        
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    public void topThree(int[] scores){
        int n = 0;
        Arrays.sort(scores);
        for(int i=scores.length-1;i>=0;i--){
            if(scores[i]>=0 && scores[i]<=100){
            	System.out.println(scores[i]);
            	if(n++>3){
                    break;
                }
            }
            //System.out.println(scores[i]);
        }
    } 
}
