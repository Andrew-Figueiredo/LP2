package meujogo.model;

import java.awt.*;

public class Tiro {
    private Image imagem;
    private int x, y;
    private int largura, altura;
    private boolean isVisivel;

    private static final int LARGURA = 938;
    private static int VELOCIDADE = 2;

    public Tiro(int x, int y) {
        this.x = x;
        this.y = y;
        isVisivel = true;

    }

    public void load() {

    }

}
