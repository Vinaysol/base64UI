package net.sourceforge.base64de.ui;

import java.awt.*;

public class UiLayout extends Frame {


    public void appLayout() {
        Container c =new Container();

Dimension d= new Dimension();
d.setSize(200,2);
        TextArea encoder = new TextArea("Encode");
        encoder.setSize(d);
        TextArea decoder = new TextArea("Decode");
        decoder.setSize(d);
Container ct=new Container();
ct.setLayout(new FlowLayout());

        Panel p=new Panel();
        p.setLayout(new GridLayout(1,1));
        p.setBackground(Color.gray);
        Label en=new Label("Encode",Label.CENTER);
        Label de=new Label("Decode",Label.CENTER);
        en.setSize(d);
        de.setSize(d);
        p.add(en);
        p.add(de);
        p.setVisible(true);

        Frame fr2=new Frame();
        fr2.setLayout(new GridLayout(1,1));
        fr2.setSize(400, 400);
        fr2.setBackground(Color.WHITE);
        fr2.add(encoder);
        fr2.add(decoder);

      fr2.setVisible(true);

      ct.add(p);
      ct.add(fr2);
      ct.setVisible(true);

// setting location of text area in frame
//            area.setBounds(10, 30, 300, 300);
// adding text area to frame
//            f.add(area);
// setting size, layout and visibility of frame
//            f.setSize(400, 400);
//            f.setLayout(null);
//            f.setVisible(true);

    }
}
