package sample;

public class test4 {
	public static void main(String[] args) {
        int[] array = new int[20];

        // 配列の要素に0から5ずつ加算して代入
        for (int i = 0; i < 20; i++) {
            array[i] = i * 5;
        }

        // [0]~[10]の奇数をカンマ区切りで表示
        for (int i = 0; i <= 10; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
                if (i < 10) {
                    System.out.print(", ");
                }
            }
        }

        // 改行
        System.out.println();

        // [11]~[19]の偶数をカンマ区切りで表示
        for (int i = 11; i < 20; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
                if (i < 19) {
                    System.out.print(", ");
                }
            }
        }
    }

}
