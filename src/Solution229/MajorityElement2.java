package Solution229;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer> res = new ArrayList<>();
       int a=nums[0],b=nums[1],count1=0,count2=0;

       for(int i=0;i<nums.length;i++){
           if(nums[i]==a){
               count1++;
           }else if(nums[i]==b){
               count2++;
           }
       }
    }
}
