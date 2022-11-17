import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Excel extends JFrame implements ActionListener {
    JPanel mainPanel = new JPanel();

    JLabel numberLabel = new JLabel("Enter numbers separate by spaces");
    JTextField number = new JTextField("");

    JLabel output = new JLabel();
    JButton calculate = new JButton("Calculate");
    JButton returnButton = new JButton("Menu");

    ButtonGroup choice = new ButtonGroup();

    JRadioButton sum = new JRadioButton("Sum", true);
    JRadioButton average = new JRadioButton("Average");
    JRadioButton min = new JRadioButton("Min");
    JRadioButton max = new JRadioButton("Max");

    public Excel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);
        add(mainPanel);
        number.setPreferredSize(new DimensionUIResource(100, 20));

        choice.add(sum);
        choice.add(average);
        choice.add(min);
        choice.add(max);

        mainPanel.add(numberLabel);
        mainPanel.add(number);
        mainPanel.add(sum);
        mainPanel.add(average);
        mainPanel.add(min);
        mainPanel.add(max);
        mainPanel.add(output);
        mainPanel.add(calculate);
        mainPanel.add(returnButton);

        calculate.addActionListener(this);
        returnButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new Excel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] numStrings = number.getText().trim().split(" ");
        if (e.getSource() == calculate) {
            if (sum.isSelected()) {
                int sum = 0;
                for (String numString : numStrings) {
                    sum += Integer.parseInt(numString);
                }

                output.setText("Sum : " + String.valueOf(sum));

            } else if (average.isSelected()) {
                int sum = 0;
                for (String numString : numStrings) {
                    sum += Integer.parseInt(numString);
                }

                output.setText("Average : " + String.valueOf(sum / numStrings.length));

            } else if (min.isSelected()) {
                int min = Integer.MAX_VALUE;
                for (String numString : numStrings) {
                    int num = Integer.parseInt(numString);
                    if (num < min) {
                        min = num;
                    }
                }

                output.setText("Min : " + String.valueOf(min));

            } else if (max.isSelected()) {
                int max = Integer.MIN_VALUE;
                for (String numString : numStrings) {
                    int num = Integer.parseInt(numString);
                    if (num > max) {
                        max = num;
                    }
                }

                output.setText("Max: " + String.valueOf(max));

            }
        } else if (e.getSource() == returnButton) {
            new App();
            super.dispose();

        }
    }
}