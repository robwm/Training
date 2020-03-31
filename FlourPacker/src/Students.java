public class Students {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0 || bigCount < 0 || smallCount < 0) return false;
        if (((bigCount * 5) + (smallCount * 1)) < goal ) return false;
        return (goal % 5 <= smallCount);
    }

}
