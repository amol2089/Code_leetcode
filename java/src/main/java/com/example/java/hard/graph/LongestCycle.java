package com.example.java.hard.graph;

import java.util.Arrays;

public class LongestCycle {

    private static int getlongestCycle(int[] edge){
        int ans = -1;
           int [][] cycleTracker = new int[edge.length][2] ;
           Arrays.fill(cycleTracker, new int[]{-1,-1});
           for(int i= 0;i<edge.length ;i++){
            int dis = 0;
            int j=i;
            while (j!=-1) {
                int distFromSourceId = cycleTracker[j][0];
                int cycleIdentifier = cycleTracker[j][1];
                if(distFromSourceId ==-1){
                    cycleTracker[j] = new int[]{dis++,i};
                }else{
                    if(cycleIdentifier ==-1){
                        ans = Math.max(ans,dis-distFromSourceId);
                    }
                    break;
                }
                j=edge[j];
            }
           }
           return ans;
    }

    public static void main(String[] args) {

        int [] arr = {13423};
        int answer = getlongestCycle(arr);
        System.out.println(answer);
    }
}
