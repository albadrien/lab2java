import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    JPanel mainPanel = new JPanel();

    JButton excel = new JButton("Excel");
    JButton main = new JButton("Main");

    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        add(mainPanel);
        mainPanel.add(excel);
        mainPanel.add(main);

        excel.addActionListener(this);
        main.addActionListener(this);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == excel) {
            new Excel();
            super.dispose();

        } else if (e.getSource() == main) {
            new Main();
            super.dispose();

        }
    }
}
