public class Transpose    
{    
    public static void main(String[] args) {    
        int rows, cols;    
             
          int a[][] = {    
                          {1, 2, 3},    
                          {4, 5, 6},    
                          {7, 8, 9}    
                       };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
  
        int t[][] = new int[cols][rows];    
            
   
        for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
                //Converts the row of original matrix into column of transposed matrix    
                t[i][j] = a[j][i];    
            }    
        }    
        
        System.out.println("Transpose of given matrix: ");    
        for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
               System.out.print(t[i][j] + " ");    
            }    
            System.out.println();    
        }    
    }    
}  