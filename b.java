package xiangm;

import java.util.ArrayList;
interface ISignUp{
	
    // ��ӡ������
    public void print() ;
    	
    // ����Ƿ��� stuType��Ӧ�İ༶����
    // ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
    public boolean addStudent (int stuType);

    // ��������������Ĳ�������ʽ�������ĵ�����
public static IParams parse() throws Exception{
	return null;
	
	
 	
 };
}
public class b {
	
	interface IParams {
	    // ��ȡ�������
	    public int getBig();
	    // ��ȡ�а�����
	    public int getMedium();
	    // ��ȡС������
	    public int getSmall();
	    // ��ȡ��ѧ���У����� [1 2 2 3] ��ʾ ���α�����ѧһ�����ѧ�����а�ѧ�����а�ѧ����С��ѧ��
	    public ArrayList<Integer> getPlanSignUp ();
	    
	}

	public static void main(String[] args) {
		

	}

}
