package net.sourceforge.base64de.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.Base64;

public class UiLayout extends Frame {


    final TextArea encoder = new TextArea();
    final TextArea decoder = new TextArea();



    public void appLayout(){
        Frame fr=new Frame();
        fr.setTitle("Decoded           Encoded");
        fr.setLayout(new GridLayout(1,1));
        fr.setSize(600, 200);
        fr.setBackground(Color.WHITE);
        textAreaDecode(fr);
        textAreaEncode(fr);

        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        fr.setVisible(true);

    }

    public void  textAreaEncode(Frame f){

        encoder.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                byte[] bytesEncoded = Base64.getDecoder().decode(encoder.getText());
                decoder.setText(new String(bytesEncoded));

            }
        });
        f.add(encoder);
    }


    public void  textAreaDecode(Frame f){
        decoder.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                byte[] valueDecoded = Base64.getEncoder().encode(decoder.getText().getBytes());
                encoder.setText(new String(valueDecoded));
            }
        });
        f.add(decoder);
    }
}
