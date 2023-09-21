package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        numberToBeRounded = Math.round(numberToBeRounded);
        int b = (int) numberToBeRounded;
        System.out.println(b);
    }
}
