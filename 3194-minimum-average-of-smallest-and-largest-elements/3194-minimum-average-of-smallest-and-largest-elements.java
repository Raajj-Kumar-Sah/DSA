class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> list=new ArrayList<>(nums.length);
        for(int num:nums){
            list.add(num);
        }

        double ans=60.0;
        for(int j=1;j<=nums.length/2;j++){
            int max=0;
            int idxmax=-1;
            int min=51;
            int idxmin=-1;
            for(int i=0;i<list.size();i++){
                if(list.get(i)>max){
                   max=list.get(i);
                   idxmax=i;
                }
                if(list.get(i)<min){
                   min=list.get(i);
                   idxmin=i;
                }
            }
            if (idxmax > idxmin) {
                list.remove(idxmax);
                list.remove(idxmin);
            } else {
                list.remove(idxmin);
                list.remove(idxmax);
            }
            double a=(max+min)/2.0;
            if(a<ans){
                ans=a;
            }

        }
        return ans;

    }
}