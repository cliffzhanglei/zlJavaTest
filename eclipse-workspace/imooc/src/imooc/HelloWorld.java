package imooc;
import java.util.Arrays;

public class HelloWorld {
    
    //��� main ����
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
        System.out.println("���Գɼ���ǰ����Ϊ��");
        hello.topThree(scores);
        
        
        
    }
    
    //���巽����ɳɼ��������ǰ�����Ĺ���
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
