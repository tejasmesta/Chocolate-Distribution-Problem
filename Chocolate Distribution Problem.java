class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        
        long min = Long.MAX_VALUE;
        
        if(m==0 || n==0){
            return 0;
        }
        
        if(m>n){
            return -1;
        }
        
        for(long i=0;i+m-1<n;i++)
        {
            min = Math.min(min,a.get((int)(i+m-1))-a.get((int)(i)));
        }
        
        return min;
    }
}
