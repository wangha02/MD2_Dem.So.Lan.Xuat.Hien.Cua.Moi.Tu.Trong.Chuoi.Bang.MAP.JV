import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chuoi");
        String input = sc.nextLine();
        String[] arr = input.toLowerCase().split("");
        String key = "";
        for (int i = 0; i < arr.length; i++) {
            if (treeMap.containsKey(arr[i])){
                int value = treeMap.get(arr[i]);
                treeMap.remove(arr[i]);
                treeMap.put(arr[i],1 );
            }else {
                treeMap.put(arr[i],1 );
            }
        }
        System.out.println("So lan xiat hien trong chuoi la: " + treeMap);
    }
}