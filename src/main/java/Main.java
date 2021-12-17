public class Main {
    static class Number {
        int minimum_no;
        int maximum_no;
    }
    static Number printMinMax(int[] array, int cnt) {
        Number digit = new Number();
        if(cnt == 1) {
            digit.maximum_no = array[0];
            digit.minimum_no = array[0];
            return digit;
        }
        if(array[0] > array[1]){
            digit.maximum_no = array[0];
            digit.minimum_no = array[1];
        }
        else{
            digit.maximum_no = array[1];
            digit.minimum_no = array[0];
        }
        for(int i = 2; i < cnt; ++i){
            if(array[i] > digit.maximum_no) {
                digit.maximum_no = array[i];
            }
            else if(array[i] < digit.minimum_no){
                digit.minimum_no = array[i];
            }
        }
        return digit;
    }

    public static void main(String[] args){
        int[] array = {1000, 11, 445, 1, 330, 3000};
        int cnt = 6;
        Number digit = printMinMax(array, cnt);
        System.out.printf("\nMinimum Number is : %d", digit.minimum_no);
        System.out.printf("\nMaximum Number is : %d", digit.maximum_no);
    }
}
