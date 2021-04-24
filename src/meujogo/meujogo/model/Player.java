package meujogo.model;

import java.awt.Image;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Player {
    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;

    public Player() {
        this.x = 100;
        this.y = 100;

    }

    public void load() {
        ImageIcon ref = new ImageIcon("res\\player1.png");
        imagem = ref.getImage();
        Image aaa = imagem.getScaledInstance(110, 50, 5);
        altura = aaa.getHeight(null);
        largura = aaa.getWidth(null);

    }

    public void update() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        int velocidade_nave = 12; // Velocidade em que a nave se movimenta.
        if (codigo == KeyEvent.VK_UP) {
            dy = -velocidade_nave;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = velocidade_nave;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -velocidade_nave;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = velocidade_nave;
        }
    }

    public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    public Image getImagem() {
        return imagem;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
