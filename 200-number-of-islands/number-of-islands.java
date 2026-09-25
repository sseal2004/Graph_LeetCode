class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                count++;
                dfs(i,j,grid);
            }
        }
       } 
       return count;
    }
    public void dfs(int row,int col,char[][]mat){
        if(row<0||col<0||row>=mat.length||col>=mat[0].length||mat[row][col]=='0')
        return;

        mat[row][col]='0';
        dfs(row+1,col,mat);
        dfs(row-1,col,mat);
        dfs(row,col+1,mat);
        dfs(row,col-1,mat);
    }
}