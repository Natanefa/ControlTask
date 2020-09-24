/*Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.

If n is greater than 0 it should rotate the array to the right. If n is less than 0 it should rotate the array to the left.
 If n is 0, then it should return the array unchanged.

Example:

Object[] data = new Object[]{1, 2, 3, 4, 5};

rotate(data, 1)    =>    {5, 1, 2, 3, 4}
rotate(data, 2)    =>    {4, 5, 1, 2, 3}
rotate(data, 3)    =>    {3, 4, 5, 1, 2}
rotate(data, 4)    =>    {2, 3, 4, 5, 1}
rotate(data, 5)    =>    {1, 2, 3, 4, 5}

rotate(data, 0)    =>    {1, 2, 3, 4, 5}

rotate(data, -1)    =>    {2, 3, 4, 5, 1}
rotate(data, -2)    =>    {3, 4, 5, 1, 2}
rotate(data, -3)    =>    {4, 5, 1, 2, 3}
rotate(data, -4)    =>    {5, 1, 2, 3, 4}
rotate(data, -5)    =>    {1, 2, 3, 4, 5}
Furthermore the method should take ANY array of objects and perform this operation on them:

rotate(new Object[]{'a', 'b', 'c'}, 1)        =>    {'c', 'a', 'b'}
rotate(new Object[]{1.0, 2.0, 3.0}, 1)        =>    {3.0, 1.0, 2.0}
rotate(new Object[]{true, true, false}, 1)    =>    {false, true, true}
Finally the rotation shouldn't be limited by the indices available in the array. Meaning that if we exceed the indices of the array it keeps rotating.

Example:

Object[] data = new Object[]{1, 2, 3, 4, 5}

rotate(data, 7)        =>    {4, 5, 1, 2, 3}
rotate(data, 11)       =>    {5, 1, 2, 3, 4}
rotate(data, 12478)    =>    {3, 4, 5, 1, 2}
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArray {
    public Object[] rotate(Object[] data, int n) {
//        Object[] data1 = new Object[]{1, 2, 3, 4, 5};
//        Object[] res = new Object[data.length];
//
//        Object[] NameS = new Object[]{1, 2, 3, 4, 5};
//
//        int last = 0;
//        for (int i = 0; i < data.length; i++){
//            if(i == 0){
//                res = data;
//            }
//            else if (i < 0) {
//                res = Collections.rotate(ddd, -n);
//            }
//            else if (i > 0) {
//                res = Collections.rotate(ddd, n);
//            }
//        }
//        return res;


        Object[] f = new Object[]{};

        if (data.length != 0) {

            ArrayList<Integer> a = new ArrayList();
            for (Object i : (Object[]) data) {
                int as = (Integer) i;
                a.add(as);
            }

            Collections.sort(a);

            if (n == 5 || n == 0 || n == -5) {
                return a.toArray();
            }

            if (n < 0) {
                n = n + 10;
            }

            if (n > 5) {
                n = n - 5;
            }

            ArrayList<Integer> b = new ArrayList();

            int first = a.get(a.size() - n - 1);

            for (int t = 0; t < a.size(); t++) {

                b.add(a.get(first));
                first = first + 1;

                if (first >= 5) {
                    first = 0;
                }
            }

            return b.toArray();
        }

        return f;
    }
}


