import powerpackage.FindPower;


import org.junit.Test;

public class PowerTest {
    @Test
    public void onePowerOne() {
        assert FindPower.calculatePower(1,1) == 1;
    }

    @Test
    public void twoPowerOne() {
        assert FindPower.calculatePower(2,1) == 2;
    }

    @Test
    public void twoPowerTwo() {
        assert FindPower.calculatePower(2, 2) == 4;
    }

    @Test
    public void threePowerTwo() {
        assert FindPower.calculatePower(3, 2) == 3*3;
    }
}
