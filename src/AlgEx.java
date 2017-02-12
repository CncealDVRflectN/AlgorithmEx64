import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        int vertexNum = scanner.nextInt();
        int edgeNum = scanner.nextInt();
        int[][] mtr = new int[vertexNum][vertexNum];
        for (int i = 0; i < edgeNum; i++) {
            add(scanner.nextInt(), scanner.nextInt(), mtr);
        }
        print(mtr, vertexNum);
        scanner.close();
    }

    private static void add(int u, int v, int[][] mtr) {
        if (mtr[u - 1][v - 1] != 1) {
            mtr[u - 1][v - 1] = 1;
            mtr[v - 1][u - 1] = 1;
        }
    }

    private static void print(int[][] mtr, int size) throws Exception {
        PrintStream writer = new PrintStream("output.txt");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                writer.print(mtr[i][j]);
                writer.print(" ");
            }
            writer.println();
        }
        writer.close();
    }
}
