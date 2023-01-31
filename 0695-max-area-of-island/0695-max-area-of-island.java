class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) 
                    ans = Math.max(dfs(grid, i, j, m, n), ans);
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int i, int j, int m, int n) {
        if (
            i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0
        ) return 0;
        grid[i][j] = 0;
        return 1+dfs(grid, i - 1, j, m, n)
        + dfs(grid, i + 1, j, m, n)
        + dfs(grid, i, j - 1, m, n)
        + dfs(grid, i, j + 1, m, n);
        
    }
}