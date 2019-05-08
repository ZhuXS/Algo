package algo;

import java.util.*;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 *
 * @author zhuxs
 * 2019/05/08
 */
public class PrintMinNumber {

    public static String printMinNumber(Integer[] nums) {
        String result = "";
        List<Integer> numList = Arrays.asList(nums);

        Collections.sort(numList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                String str1 = o1 + "" + o2;
                String str2 = o2 + "" + o1;
                return str1.compareTo(str2);
            }
        });

        for (Integer sortedNum : numList) {
            result += sortedNum;
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] testCase = {21,3,1};
        System.out.println(PrintMinNumber.printMinNumber(testCase));
    }
}
