import java.util.Scanner;

public class TEST {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력"); // syso - > sout / 이클 -> 인텔
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        spiralArray(n1,n2);
    }

    public static void spiralArray(int x, int y){
        // 임시 배열
        int[][] copy = new int[x][y]; // 2차원 배열을 만들어 입력받은 만큼 공간을 생성한다.
        int cnt = 0; // 0~ x*y-1 값
        int flag = 0; // 스위치문에서 플래그로 진행방향 설정
        int i = 0, j = 0;

        while (true){
            switch(flag){
                case 0 :
                    copy[i][j++] = cnt++;
                    if(j == y || copy[i][j] != 0)
                    break;
                case 1 :
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            if(cnt == x*y)
                break;
        }


    }
}