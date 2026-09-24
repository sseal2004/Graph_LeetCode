class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[]visited = new boolean [n];
        int count =0;
        for(int i =0;i<n;i++){
                if(!visited[i]){
                    dfs(i,visited,isConnected);count++;

                }
        }
        return count;
    }

    static void dfs(int node,boolean[]vis,int[][]adjArr){
        vis[node]=true;
        for(int i =0;i<adjArr.length;i++){
            if(!vis[i] && adjArr[node][i]==1){
                dfs(i,vis,adjArr);
            }
        }

    }
}