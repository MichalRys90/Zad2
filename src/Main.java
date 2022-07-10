import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 5, 8, 9, 8}, new int[]{1, 2, 5, 8})));

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> setA = new ArrayList<>();
        List<Integer> setB = new ArrayList<>();

        for (int as : a) {
            setA.add(as);
        }
        for (int bs : b) {
            setB.add(bs);
        }
        setA.removeAll(setB);
        int[] result2 = new int[setA.size()];
        for (int i = 0; i < setA.size(); i++) {
            result2[i] = setA.get(i);
        }
        /* Second way
          Iterator<Integer> iter = setA.iterator();
        while (iter.hasNext()) {
            int c = iter.next();
            for (int bs : b) {
                if (c == bs) {
                    iter.remove();
                }
            }
        }
        int[] result = new int[setA.size()];
        for (int i = 0; i < setA.size(); i++) {
            result[i] = setA.get(i);
        } */
        return result2;
    }
}
