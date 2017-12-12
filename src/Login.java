import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Login extends JFrame {
    private JButton jbtnStart = new JButton("Start");
    private JButton jbtnExit = new JButton("Exit");
    private JLabel jlb1 = new JLabel("潛水艇大戰");
    private JPanel jpn = new JPanel();
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW = 500,frmH = 300,screenW,screenH;
    public Login(){
        init();
    }
    public void init(){
    screenW=dim.width;
    screenH=dim.height;
    this.setBounds(screenW/2-frmW/2,screenH/2-frmH,frmW,frmH);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(null);

    jlb1.setBounds(155,50,200,60);
    jlb1.setOpaque(true);
    jlb1.setFont(new Font(null,Font.BOLD,38));
    jbtnStart.setBounds(215,130,70,35);
    jbtnExit.setBounds(215,165,70,35);


    this.add(jlb1);
    this.add(jbtnStart);
    this.add(jbtnExit);
    }
}
public class ImagePane extends JPanel {

    private Image image;

    public ImagePane() {
        try {
            image = ImageIO.read(new File("src/demo/java.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new ImagePane());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
