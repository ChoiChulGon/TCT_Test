import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

public class wordArrangement {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // STRING -> INT / 처음 길이

        String[] input = new String[n]; // 입력받은 크기만큼 배열 생성

        int i;
        for(i = 0 ; i < n; i++){
            input[i] = br.readLine();
        } //입력받는대로 받음.

        //길이로 정렬
        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        int j, len, len_temp;
        for(i=0; i<n ; i++){ // 알파벳순
            len = input[i].length();
            for (j= i + 1 ; j < n; j++){
                len_temp = input[j].length();
                if(len != len_temp) break; //길이같으면 패스

            }
            Arrays.sort(input,i,j);
            i=j-1;
        }
        System.out.println(input[0]);
        for(i = 1; i < n ; i ++){
            if(input[i-1].equals(input[i])) continue; //중복 제거
            System.out.println(input[i]);
        }

    }
}