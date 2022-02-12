package powerpackage;

public class FindPower {
    public static int calculatePower(int base, int power) {
        int ans = 1;
        for (int i = 0; i<power; i++) {
            ans *= base;
        }
        return ans;
    }
}
