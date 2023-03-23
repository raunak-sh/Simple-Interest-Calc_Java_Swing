package SimpleInterest;


	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;


	public class SimpleInterest extends JFrame {
		public static void main(String[] args) {
			SimpleInterest flow = new SimpleInterest();
			flow.setTitle("Simple Interest Calculator");
			flow.setVisible(true);
		}

		public SimpleInterest() {
			setLayout(new FlowLayout());
			add(new JLabel("Principal:"));
			JTextField pTextField = new JTextField(10);
			add(pTextField);
			add(new JLabel("Rate:"));
			JTextField rTextField = new JTextField(10);
			add(rTextField);
			add(new JLabel("Time:"));
			JTextField tTextField = new JTextField(10);
			add(tTextField);
			add(new JLabel("Interest:"));
			JTextField interestTextField = new JTextField(10);
			interestTextField.setEditable(false);
			add(interestTextField);
			JButton calculateButton = new JButton("Calculate");
			add(calculateButton);
			calculateButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						double p = Double.parseDouble(pTextField.getText());
						double r = Double.parseDouble(rTextField.getText());
						double t = Double.parseDouble(tTextField.getText());
						double interest = (p * t * r) / 100;
						interestTextField.setText(String.valueOf(interest));
					} catch (NumberFormatException er) {
						System.out.print("Enter number,not string");
					}
				}
			});
			pack();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}

