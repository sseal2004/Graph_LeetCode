class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int original = image[sr][sc];
            if(original==color)return image;
            dfs(original,color,image,sr,sc);
            return image;
    }
    public void dfs(int original,int color,int image[][],int row,int col){
        if(row<0||col<0||row>=image.length||col>=image[0].length
        ||image[row][col]!=original)return;

        image[row][col]=color;
          dfs(original,color,image,row+1,col);
          dfs(original,color,image,row-1,col);
          dfs(original,color,image,row,col+1);
          dfs(original,color,image,row,col-1);
    }
}