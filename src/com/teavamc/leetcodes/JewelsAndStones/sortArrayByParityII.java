package com.teavamc.leetcodes.JewelsAndStones;

/**
 * @author 张超 teavamc
 * @Description:
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *
 * 提示：
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *
 * @ClassName sortArrayByParityII
 * @date 2019/3/10 18:07
 **/
public class sortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int odd = 1;
        int even = 0;
        for (int a:A){
            if (a%2 == 0){
                res[even] = a;
                even+=2;
            }else{
                res[odd] = a;
                odd+=2;
            }
        }
        return res;
    }
}
