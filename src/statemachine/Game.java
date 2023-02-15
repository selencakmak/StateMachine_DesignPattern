package statemachine;

public class Game {

	private IGameConsole console;

    public IGameConsole getConsole() {
        return console;
    }

    public void setConsole(IGameConsole console) {
        this.console = console;
    }

    public Game(){
        System.out.println("Game is starting...");
        console= new Attack();

    }

    public void triangle(){
        console.pressTriangle();
    }

    public void square(){
        console.pressSquare();
    }

    public void circle(){
        console.pressCircle();
    }

    public void X(){
        console.pressX();
    }

    public void Interception(){
        System.out.println("The ball is caught. Going on the attack");

        console =new Attack();
    }


    public void DropTheBall(){
        System.out.println("The ball is lost to the opposing team. Defense now");

        console =new Defense();
    }
}
