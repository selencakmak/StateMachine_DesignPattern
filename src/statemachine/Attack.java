package statemachine;

public class Attack implements IGameConsole{

	@Override
    public void pressSquare() {
        System.out.println("Shot");

    }

    @Override
    public void pressTriangle() {
        System.out.println("Breaking Pass");

    }

    @Override
    public void pressCircle() {

        System.out.println("Long Pass");
    }

    @Override
    public void pressX() {
        System.out.println("Short Pass");

    }
}
