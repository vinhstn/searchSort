public class SearchSort{



    public static void main(){
            
            System.out.println("-------Testing Sequential Search-------");
            int[] array1 = {44, 39, 2, 18, 47, 59, 83, 40, 14, 93, 88, 101, 73};
            int target = 83;
            int foundIndex = sequentialSearch(array1, target);
            System.out.println("ANSWER SHOULD BE INDEX 6");
            System.out.println("We found " + target + " at index " + foundIndex + ", -1 means not found.");
            
            target = 82;
            foundIndex = sequentialSearch(array1, target);
            System.out.println("ANSWER SHOULD BE INDEX -1");
            System.out.println("We found " + target + " at index " + foundIndex + ", -1 means not found");
            
            System.out.println("-------Testing Binary Search-------");
            int[] array2 = {44, 49, 52, 58, 67, 69, 83, 90, 94, 99, 100, 101, 173};
            target = 52;
            foundIndex = binarySearch(array2, target);
            System.out.println("ANSWER SHOULD BE INDEX 2");
            System.out.println("We found " + target + " at index " + foundIndex + ", -1 means not found");
            
            target = 82;
            foundIndex = binarySearch(array2, target);
            System.out.println("ANSWER SHOULD BE INDEX -1");
            System.out.println("We found " + target + " at index " + foundIndex + ", -1 means not found");
            
            
            System.out.println("-------Testing Selection Sort-------");
            selectionSort(array1);
            for(int num: array1){
                System.out.print(num + " ");
            }
            System.out.println("\n-------Testing Insertion Sort-------");
            int[] array3 = new int[20];
            
            for(int i = 0; i < array3.length; i++){
                array3[i] = (int)( Math.random()*(101) );
            }
            
            insertionSort(array3);
            for(int num: array3){
                System.out.print(num + " ");
            }
            
        }
        
        
        //search for a target element, start on the far left and work your way to the right
        //return the index of the first occurence of target, or return -1 if target is not in the array
        public static int sequentialSearch(int[] arr,int target) {
        
           for (int i = 0; i < arr.length; i++){
               
             if (???????? == ???????) {
              return ????????;
             }
           }
            return ???????;
        }
        
        
        //search for a target value in an array, the array must be pre-sorted
        //split the array in half each time (hence binary search)
        //return the index of the target value or return -1 if not in the array
        public static int binarySearch(int arr[], int target)
        {
            int left = 0;
            int right = arr.length - 1;
            while (??????? <= ???????) {
                int mid = (left + right) / ???????;
     
                
                if (arr[??????] == ???????) {
                    return ????????;
     
                } else if (arr[???????] > ????????) {
                    right = ?????????;
     
                } else {
                  left = ?????????;
                }  
            }
     
        
            return ????????;
        }
        
        
        //go through each index, starting at the left
        //compare each successive element to find the smallest remaining element
        //swap the smallest remaining element with the current position being checked
        //then move to the next position until the array is all sorted
        public static void selectionSort(int[] arr)
        {
            for(int i = 0; i < arr.length - 1; i++)
            {
                int minIndex = ????????;
                
                for(int j = ????????; j < arr.length; j++){
                    if(arr[j] < arr[??????????])
                        minIndex = ????????;
                }
                
                int temp = ????????;
                arr[minIndex] = ???????;
                arr[i] = ????????;
            }
        }
        
        //start at index 1 in the array
        //compare this element to each element to the left
        //find where it should fit in to be sorted
        //now go to index 2 in the array and find where it should be sorted compared
        //to all elements to the left, repeat this process for all indices in the array
        //the array is now sorted
            public static void insertionSort(int[] arr)
        {
            for (int i = 1; i < arr.length; i++)
            {
                int elementToInsert = arr[???????];
                int j = i;
        
                while (j > 0 && ????????? < arr[j - 1])
                {
                    arr[j] = arr[j - 1];
                    ?????;
                }
        
                arr[j] = ????????;
            }
        }
        
    }