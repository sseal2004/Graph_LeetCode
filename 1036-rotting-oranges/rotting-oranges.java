class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int [][]vis = new int[r][c];
        int fresh=0;
        Queue<int[]>q= new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});//row col time
                    vis[i][j]=2;
                }
                if(grid[i][j]==1)fresh++;
            }
        }
        int[][]directions= {{1,0},{-1,0},{0,1},{0,-1}};
        int time=0;int countTotalrotten=0;
    while(!q.isEmpty()){
            int[]temp = q.poll();
            int row = temp[0];
            int col = temp[1];
            int t = temp[2];

            time=Math.max(time,t);

        for(int[] dir : directions){
                int nr = row+dir[0];
                int nc = col+dir[1];

            if(nr >= 0 && nr < r && nc >= 0 && nc < c && vis[nr][nc] == 0 
            && grid[nr][nc] == 1) {
                q.add(new int[]{nr,nc,t+1});
                vis[nr][nc]=2;
                countTotalrotten++;
            }
        }

    }
    if(countTotalrotten != fresh) return -1;
    return time;
    }
}