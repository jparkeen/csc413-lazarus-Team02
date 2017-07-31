package src.commons;

import src.core.Lazarus;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeysControl extends KeyAdapter {
    private LazarusObject player;

    public KeysControl(LazarusObject player){
        this.player = player;
    }

    public void keyPressed(KeyEvent e){
        int keysCode = e.getKeyCode();

        if (keysCode == KeyEvent.VK_LEFT){
            Lazarus.moveLeft = true;
        }
        if(keysCode == KeyEvent.VK_RIGHT){
            Lazarus.moveRight = true;
        }
        if(keysCode == KeyEvent.VK_SPACE){
            Lazarus.jump = true;
        }
    }

    public void keyReleased(KeyEvent e){
        int keysCode = e.getKeyCode();

        if (keysCode == KeyEvent.VK_LEFT){
            Lazarus.moveLeft = false;
        }
        if(keysCode == KeyEvent.VK_RIGHT){
            Lazarus.moveRight = false;
        }
        if(keysCode == KeyEvent.VK_SPACE){
            Lazarus.jump = false;
        }
    }
}