package statemachine;

public class Defense implements IGameConsole{
	@Override
    public void pressSquare() {

        System.out.println("Intervention");
    }

    @Override
    public void pressTriangle() {

        System.out.println("Goalkeeper playing");
    }

    @Override
    public void pressCircle() {
        System.out.println("Intervention by sliding");

    }

    @Override
    public void pressX() {
        System.out.println("Marking");

}
