import java.util.Scanner;

public class Spiral_array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요  ex) 6 6 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        spiralArray(num1, num2);

    }

    public static void spiralArray(int x, int y) {

        int[][] copy = new int[x][y];
        int count = 0;      // 0  ~  x*y-1 값
        int flag = 0;       // 진행방향
        int i = 0, j = 0;

        while (true) {
            switch (flag) {                         //  진행방향    ->
                case 0:                                 //  방에 값을 넣고 1 증가 시킴
                    copy[i][j++] = count++;             //  다음 방향으로 한칸 이동
                    if (copy[i][j] != 0 || j == y) {    //  이동한 방에 값이 있거나 방이 없으면 경로 체인지
                        j--;                            //  이전 방으로 돌아온다
                        i++;                            //  다음 진행할 방향으로 한칸이동, 밑으로 가야함
                        flag = 1;                       //  진행방향 설정
                    }
                    break;
                case 1:                                 //  진행방향    ↓
                    copy[i++][j] = count++;
                    if (i == x || copy[i][j] != 0) {  // 방이 x, 값이 있다면 경로 체인지
                        i--;
                        j--;
                        flag = 2;
                    }
                    break;
                case 2:                                 //  진행방향    <-
                    copy[i][j--] = count++;
                    if (j == -1 || copy[i][j] != 0) { // 초기 인덱스가 0이니깐 j가 -1 (방이 없다.) 또는 값이 존재한다면 경로 체인지
                        i--;
                        j++;
                        flag = 3;
                    }
                    break;
                case 3:                                 //  진행방향    ↑
                    copy[i--][j] = count++;
                    if (i == 0 || copy[i][j] != 0) { // 초기
                        i++;
                        j++;
                        flag = 0;
                    }
                    break;
            }

            if (count == x * y)    // 모든방에 값이 들어가면 나가기
                break;
        }

        for (i = 0; i < x; i++) { // 출력부분
            for (j = 0; j < y; j++) {
                System.out.print(copy[i][j] + "\t");
            }
            System.out.println();
        }
    }

}