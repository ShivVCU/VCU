
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c)); 

  /**********************************************************
     * 3 is incremented by 1 using the new value in the statement     
     * The value displayed is 4
     ***********************************************************/
    System.out.println("#3 " + (++a));       

    /**********************************************************
     * 3 is deremented by 1 using the new value in the statement      
     * The value displayed is 3
     ***********************************************************/
    System.out.println("#4 " + (--a));

/**********************************************************
     * 3 is incremented by 1 using the original value in the statement     
     * The value displayed is 3
     ***********************************************************/
    System.out.println("#5 " + (a++));     

/**********************************************************
     * 3 is decremented by 1 using the original value in the statement     
     * The value displayed is 4
     ***********************************************************/
    System.out.println("#6 " + (a--));

/**********************************************************
     * 3 is added to 1     
     * The value displayed is 4
     ***********************************************************/
    System.out.println("#7 " + (a + 1));

      /**********************************************************
     * 17 is divied by 5 which gives us the remainder 2     
     * The value displayed is 2
     ***********************************************************/    
    System.out.println("#8 " + (d % c));  

  /**********************************************************
     * 17 is divided by 5      
     * The value displayed is 3 
     ***********************************************************/
    System.out.println("#9 " + (d / c));

    /**********************************************************
     * 17 is divided by 4 which gives us the remainder 1     
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#10 " + (d % b)); 

   /**********************************************************
     * 17 is divided by 4
     * The value displayed is 4
     ***********************************************************/
    System.out.println("#11 " + (d / b));  

/**********************************************************
     * 3 is divided by 17 because division has higher precedence, giving us the result 0  
     * 17 is added to 4 giving us 21
     * The value displayed is 21
     ***********************************************************/
    System.out.println("#12 " + (d + a / d + b)); 

/**********************************************************
     * 17 is added to 3 giving us 20
     * 17 is added to 4 giving us 21  
     * 20 is divided by 21 giving us 0
     * The value displayed is 0
     ***********************************************************/
    System.out.println("#13 " + ((d + a) / (d + b))); 

/**********************************************************
     * The square root of 4 is taken and the result is 2     
     * The value displayed is 2.0
     ***********************************************************/
    System.out.println("#14 " + (Math.sqrt(b)));   

    /**********************************************************
     * 3 to the power of 4 is taken resulting in 81     
     * The value displayed is 81.0
     ***********************************************************/    
    System.out.println("#15 " + (Math.pow(a, b))); 

/**********************************************************
     * The absolute value of -3 is taken resulting in 3   
     * The value displayed is 3
     ***********************************************************/
    System.out.println("#16 " + (Math.abs(-a)));

/**********************************************************
     * Results in the largest value  
     * The value displayed is 4
     ***********************************************************/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 
