import javax.swing.JPanel;
import java.awt.*;

//game window
public class GamePanel extends JPanel{
    //screen settings
    final int originalTileSize = 16; //16x16 tile too small in new resolution, we need to scale
    final int scale = 3; //we want to expend char size 16*3 = 48
    final int tileSize = originalTileSize * scale; //48*48 tile of character better on PC screen
    //how many tiles can be displayed on a single screen horizontally and vertically
    //ratio 4/3
    final int maxScreenCol = 18;
    final int maxScreenRow = 14; //14

    //size of the game screen
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    //constructor of GamePanel to display wondow
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight)); //size of this class
        this.setBackground(Color.black); //color background
        this.setDoubleBuffered(true); //improve rendering performance
    }
}

