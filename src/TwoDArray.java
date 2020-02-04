import java.util.Arrays;

public class TwoDArray {

    public int[][] twoDArray = new int[5][5];

    public TwoDArray(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                twoDArray[i][j] = (int)Math.random() * 50 + 1;
            }
        }
        //this.twoDArray = twoDArray;
    }

    public int findGreatestCross(){
        int[] sums = new int[9];
        int[] indices = new int[9];
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                int sum = 0;
                //indices
                sum += this.twoDArray[i][j];
                sum += this.twoDArray[i][j - 1];
                sum += this.twoDArray[i][j + 1];
                sum += this.twoDArray[i - 1][j];
                sum += this.twoDArray[i + 1][j];
                sums[i - 1] = sum;
            }
        }
        Arrays.sort(sums);
        return sums[8];
    }

    public static void main(String[] args){
        TwoDArray twoD = new TwoDArray();
        twoD.findGreatestCross();
    }
}
