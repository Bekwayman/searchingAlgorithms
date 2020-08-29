package Lab_01;
public class searchAlgorithm{
    public static int linearSearch(int[] array, int[] keys, int n){
        for(int x=0; x<keys.length; x++){
            for(int i=0; i<array.length; i++){
                if(array[i]==keys[x]){
                    return i;
                }
                else if(array[i]==n){
                    return -1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int array[], int first, int last, int[] keys){  
        for(int x=0; x<keys.length; x++){
            int mid = (first + last)/2;  
            while( first <= last ){  
                if ( array[mid] < keys[x] ){  
                    first = mid + 1;     
                }else if ( array[mid] == keys[x] ){  
                    return mid;  
                }else{  
                    last = mid - 1;  
                }  
                mid = (first + last)/2;  
            }  
            if ( first > last ){  
                return -1;  
            }
        }
        return -1;  
    }
}