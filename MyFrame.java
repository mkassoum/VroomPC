import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener {

    JButton maxPerf = new JButton();
    JButton flushDNS;
    JButton disBackG;
    JButton minRes;
    JButton reset;
    JLabel text = new JLabel ("This Tool is made by: KSM#3898");
    JLabel text2 = new JLabel("USE CODE EBN");

    public MyFrame() {
        this.maxPerf.setBounds(20, 20, 250, 35);
        this.maxPerf.addActionListener(this);
        this.maxPerf.setText("Max Performance");
        this.flushDNS = new JButton();
        this.flushDNS.setBounds(20, 60, 250, 35);
        this.flushDNS.addActionListener(this);
        this.flushDNS.setText("Flush DNS");
        this.disBackG = new JButton();
        this.disBackG.setBounds(20, 100, 250, 35);
        this.disBackG.addActionListener(this);
        this.disBackG.setText("Shut Background Programs");
        this.minRes = new JButton();
        this.minRes.setBounds(20, 140, 250, 35);
        this.minRes.addActionListener(this);
        this.minRes.setText("Lowest Timer Resolution");
        this.reset = new JButton();
        this.reset.setBounds(20, 220, 250, 35);
        this.reset.addActionListener(this);
        this.reset.setText("Reset Settings");
        this.text.setBounds(40,350,250,40);
        this.text2.setBounds(90,370,250,40);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("vroomIcon.jpg")));
        this.setLayout(null);
        this.setSize(300, 500);
        this.setVisible(true);
        this.add(this.maxPerf);
        this.add(this.flushDNS);
        this.add(this.disBackG);
        this.add(this.minRes);
        this.add(this.reset);
        this.add(text);
        this.add(text2);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.maxPerf) {
            try {
                function.runCom(winBef.maxPref,null,null);
            } catch (IOException var7) {
                throw new RuntimeException(var7);
            }
        } else if (e.getSource() == this.flushDNS) {
            try {
                function.runCom(winBef.flushDNS,null,null);
            } catch (IOException var6) {
                throw new RuntimeException(var6);
            }
        } else if (e.getSource() == this.disBackG) {
            try {
                function.runCom(winBef.disBackG,null,null);
            } catch (IOException var5) {
                throw new RuntimeException(var5);
            }
        } else if (e.getSource() == this.minRes) {
            try {
                function.runCom(winBef.minRes1,winBef.minRes2,winBef.minRes3);
            } catch (IOException var4) {
                throw new RuntimeException(var4);
            }
        }

        if (e.getSource() == this.reset) {
            try {
                function.runCom(winBef.resetP,winBef.enBackG,null);
            } catch (IOException var3) {
                throw new RuntimeException(var3);
            }
        }

    }
}
