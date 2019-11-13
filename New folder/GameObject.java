package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import GameStage.Main;

public abstract class GameObject {
    public int i, j;
    public int x;
    public int y;
    public Image img;
    //public Direction direction;

    public abstract void render(GraphicsContext gc);
    public abstract void update();
}
