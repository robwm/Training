public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal) {

        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int sum = ((bigCount * 5) + smallCount);
        if(goal >= sum) {
            while(sum % 5 > 0) {
                sum %= 5;
            }



            if(sum < goal) {
                return false;
            } else {
                return true;
            }
        }
        //The sum is lower than the goal
        return false;
    }

}
