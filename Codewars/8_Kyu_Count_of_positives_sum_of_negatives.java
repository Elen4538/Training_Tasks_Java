public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    { int posCount = 0;
      int negSum = 0;
          
      if ((input == null)||(input.length ==0 )){
      
        return new int[] {}; 
      }
     
      else{ for(int i = 0; i<input.length;i++){
        
         if(input[i]>0){
           
            posCount += 1;
       }
         else{
             negSum += input[i];
       }
       
        }
       
        int [] res = {posCount, negSum};
     
        return res;     
     }
     
    }
}
