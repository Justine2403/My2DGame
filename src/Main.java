import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame(); //Create a window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window
        window.setResizable(false); //no resize window
        window.setTitle("The Great Adventure"); //title of the game

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); //add gamePanel to window
        window.pack(); // enable window to fit preferred size

        window.setLocationRelativeTo(null); //center window
        window.setVisible(true);

            }
}