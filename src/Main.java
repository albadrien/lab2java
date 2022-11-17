import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
    JPanel mainPanel = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    JLabel nameLabel = new JLabel("name");
    JTextField name = new JTextField("");

    JLabel firstnameLabel = new JLabel("Firstname");
    JTextField firstname = new JTextField("");

    JLabel addressLabel = new JLabel("Address");
    JTextField address = new JTextField("");

    JLabel cityLabel = new JLabel("City");
    JTextField city = new JTextField("");

    JLabel provinceLabel = new JLabel("Province");
    JTextField province = new JTextField("");

    JLabel emailLabel = new JLabel("e-mail");
    JTextField email = new JTextField("");

    JLabel output = new JLabel();

    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");
    JButton returnButton = new JButton("Menu");

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 500);
        add(mainPanel);

        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(outputPanel);

        name.setPreferredSize(new Dimension(100, 20));
        firstname.setPreferredSize(new Dimension(100, 20));
        address.setPreferredSize(new Dimension(100, 20));
        city.setPreferredSize(new Dimension(100, 20));
        province.setPreferredSize(new Dimension(100, 20));
        email.setPreferredSize(new Dimension(100, 20));

        inputPanel.add(nameLabel);
        inputPanel.add(name);
        inputPanel.add(firstnameLabel);
        inputPanel.add(firstname);
        inputPanel.add(addressLabel);
        inputPanel.add(address);
        inputPanel.add(cityLabel);
        inputPanel.add(city);
        inputPanel.add(provinceLabel);
        inputPanel.add(province);
        inputPanel.add(emailLabel);
        inputPanel.add(email);

        buttonPanel.add(submit);
        buttonPanel.add(reset);
        buttonPanel.add(returnButton);

        outputPanel.add(output);

        submit.addActionListener(this);
        reset.addActionListener(this);
        returnButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            output.setText(
                    "<html>Name : " + name.getText() + " " + firstname.getText() + "<br> Address : "
                            + address.getText()
                            + "<br>City : " + city.getText() + ", " + province.getText() + "<br>e-mail : " +
                            email.getText() + "</html>");
        } else if (e.getSource() == reset) {
            name.setText("");
            firstname.setText("");
            address.setText("");
            city.setText("");
            email.setText("");
            output.setText("");
        } else if (e.getSource() == returnButton) {
            new App();
            super.dispose();

        }
    }
}
