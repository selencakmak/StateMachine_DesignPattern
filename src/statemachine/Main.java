package statemachine;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
        game.circle();
        game.triangle();
        game.X();
        game.square();

        game.DropTheBall();
        game.X();
        game.square();
        game.Interception();

	}

}
