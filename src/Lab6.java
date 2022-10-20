public class Lab6 {
    public static void main(String[] args) {

        Integer arr_i[] = {2,8,20,3,4};
        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};

        System.out.println(array_max(arr_i));
        System.out.println(array_max(arr_d));
    }

    public static <T extends Comparable<T> > T array_max(T[] array){       
        T max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(max) > 0)
            max = array[i];       
            //for(T data: array){
            //if(data.compareTo(max)>0)
            //max =data;          
        }
        return max;
     }
        }
    