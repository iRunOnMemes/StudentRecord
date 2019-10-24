public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {
      if(first>=last){
        return -1;
    }
        if(first<0||last<0||first>scores.length-1||last>scores.length-1){
        return -2;
    }
        int sum = 0;
        for(int i = first; i<=scores.length-1; i++){
        sum+=scores[i];
    }
    return (double)sum/(last-first+1);
  
        //here so the class compiles part a
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
      for(int i = 1; i<=scores.length-1; i++){
          if (scores[i]<scores[i-1]){
              return false;
            }
      }  
   return true;
}
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      if(this.hasImproved()){
          return this.average(scores.length/2, scores.length-1);
   }else{
       return this.average(0, scores.length-1);
    }
}
    }
