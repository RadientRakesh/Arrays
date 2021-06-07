
public class Array1findKeyInEverySegment {
     public static boolean findTheKeyInEverySegment(int len,int arr[],int x,int k) {
    	  boolean b = false;
          int i;
          int j = 0;
           for(i=0;i<len; i=i+k){
               for( j=i;j<i+k;j++){
                   if(j<len && arr[j]==k){
                      break ;
                   }
                   if(j==i+k || j>len) {
                	   return false;
                   }
               	}
           }
           if(j<len) {
        	  return true;
           }
           else {
        	   return b;
           }
     }
}

      
