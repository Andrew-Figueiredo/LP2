package meujogo.model;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy1 {
    private Image imagem;
    private int x, y;
    private int largura, altura;
    private boolean isVisivel;

    // private static final int LARGURA = 938; // onde o tiro some
    private static int VELOCIDADE = 3; // Velocidade do Enemy

    public Enemy1(int x, int y) {
        this.x = x;
        this.y = y;
        isVisivel = true;

    }

    public void load() {
        ImageIcon ref = new ImageIcon("res\\enemys.png");
        imagem = ref.getImage();

        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

    }

    public void update() {
        this.x -= VELOCIDADE;

        // if (this.x > LARGURA) {
        // isVisivel = false;
        // }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int vELOCIDADE) {
        VELOCIDADE = vELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }

}
