
//User function Template for Java

class Solution
{
    public int  Count(int[][] mat)
    {
       int ar_x[] = {-1,-1,-1,0,0,0,1,1,1};
       int ar_y[] = {-1,0,1,-1,0,1,-1,0,1};
       int row = mat.length;
       int col = mat[0].length;
       int ans=0;
       
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               int count=0; 
               if(mat[i][j]==1)
               {
                   for(int x=0; x<9; x++){
                       int a_x = i+ar_x[x];
                       int a_y = j+ar_y[x];
                       
                       if(a_x>=0 && a_x<row && a_y>=0 && a_y<col)
                       {
                           if(mat[a_x][a_y]==0)
                           {
                               count++;
                           }
                       }
                   }
                   if(count>0 && count%2==0){
                       ans++;
                   }
               }
           }
       }
       return ans;
    }
}
