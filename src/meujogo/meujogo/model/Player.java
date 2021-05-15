package meujogo.model;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Player implements ActionListener {
    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;
    private List<Tiro> tiros;
    private boolean isVisivel, isTurbo;
    private Timer timer;

    public Player() {
        this.x = 25;
        this.y = 256;
        isVisivel = true;
        isTurbo = false;

        tiros = new ArrayList<Tiro>();

        timer = new Timer(5, this); // Velocidade do jogo
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        turbo();

    }

    public void load() {
        ImageIcon ref = new ImageIcon("res\\player1.png");
        imagem = ref.getImage();

        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);

    }

    public void update() {
        x += dx;
        y += dy;
    }

    public void tiroSimples() {
        this.tiros.add(new Tiro(x + largura, y + (altura / 2)));
    }

    public void turbo() {
        isTurbo = true;

        ImageIcon ref = new ImageIcon("res\\player1.png"); // TODO: Trocar para Imagem do Turbo
        imagem = ref.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }

    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        int velocidade_nave = 15; // Velocidade em que a nave se movimenta.
        if (codigo == KeyEvent.VK_A) {
            tiroSimples();
            ;
        }
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

    public List<Tiro> getTiros() {
        return tiros;
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

}
