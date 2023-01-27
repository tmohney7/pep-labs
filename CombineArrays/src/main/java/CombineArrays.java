
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1 = a1 + b1;
        int[] combine = new int[c1];
        for (int i = 0; i < a1; i = i + 1) {
            combine[i] = arr1[i];
        }
        for (int i = 0; i < b1; i = i + 1) {
            combine[a1 + i] = arr2[i];
        }
        for (int i = 0; i < c1;) {
        }
        return combine;
    }
}

