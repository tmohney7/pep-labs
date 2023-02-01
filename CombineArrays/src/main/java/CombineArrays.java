
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public static int[] combine(int[] arr1, int[] arr2){
        int[]array3 = new int[arr1.length + arr2.length];
        int c = 0;
        for(int i = 0; i < arr1.length ; i++){
            array3[i] = arr1[i];
            c++;
        }
        for(int j=0;j < arr2.length; j++){
            array3[c++] =arr2[j];
        }
        for( int i = 0; i < array3.length; i++){
        }
        return array3;        
    }}