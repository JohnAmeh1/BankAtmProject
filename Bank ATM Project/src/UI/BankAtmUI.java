package UI;

import com.sun.nio.sctp.SendFailedNotification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAtmUI {
    char uniChar = '\u20A6';
    JFrame Frame = new JFrame("window");
    JButton Login = new JButton("Login");
//    JLabel Welcome = new JLabel("");
    JLabel Pin = new JLabel(" Enter Pin:");
    JTextField PinField = new JTextField();

    public void mainUI() {
        Frame.setSize(450, 500);
        Frame.setLayout(new GridLayout(3, 1));
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setTitle("Welcome to the Bank of the future...");
//        Frame.setContentPane().setBackground(Color.RED);

        Frame.add(Pin);
        Frame.add(PinField);
        Frame.add(Login);

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float userID = (Float.parseFloat(PinField.getText()));
                if (userID == 5555) {
                    accountTypeUI();
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid Pin, Try again");
                }
            }
        });

    }

    JFrame Frame2 = new JFrame("window");

    JButton accountTypeSavings = new JButton("Savings Account");
    JButton accountTypeCurrent = new JButton("Current Account");

    public void accountTypeUI() {
        Frame2.setSize(450, 500);
        Frame2.setLayout(new GridLayout(2, 1));
        Frame2.setVisible(true);
        Frame2.setLocationRelativeTo(null);
        Frame2.setTitle("Choose your account type");

        Frame2.add(accountTypeSavings);
        Frame2.add(accountTypeCurrent);

        accountTypeSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savingsUI();
            }
        });
//        accountTypeCurrent.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                currentUI();
//            }
//        });
    }
    JFrame FrameSavings = new JFrame("window");
    JLabel Balance = new JLabel("Balance: "+uniChar+"100000");
    JButton depositSavings = new JButton("Deposit");
    JButton withdrawSavings = new JButton("Withdraw");

    public void savingsUI() {
        FrameSavings.setSize(450, 500);
        FrameSavings.setLayout(new GridLayout(3, 1));
        FrameSavings.setVisible(true);
        FrameSavings.setLocationRelativeTo(null);
        FrameSavings.setTitle("Account: Savings");

        FrameSavings.add(Balance);
        FrameSavings.add(depositSavings);
        FrameSavings.add(withdrawSavings);

        depositSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositSavingsUI();
            }
        });
        withdrawSavings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawSavingsUI();
            }
        });
    }
    JFrame FrameDepositSave = new JFrame("window");
    JButton DepositSave = new JButton("Deposit");
    //    JLabel Welcome = new JLabel("");
    JLabel AmountDepSave = new JLabel( " Enter Deposit Amount:");
    JTextField AmountFieldDepSave = new JTextField();
//    JLabel test = new JLabel(AmountFieldDepSave);

    public void depositSavingsUI(){
        FrameDepositSave.setSize(450, 500);
        FrameDepositSave.setLayout(new GridLayout(3, 1));
        FrameDepositSave.setVisible(true);
        FrameDepositSave.setLocationRelativeTo(null);
        FrameDepositSave.setTitle("Deposit");

        FrameDepositSave.add(AmountDepSave);
        FrameDepositSave.add(AmountFieldDepSave);
        FrameDepositSave.add(DepositSave);

        DepositSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankAtm assObj = new BankAtm();
                float answer = assObj.balance1(Float.parseFloat(AmountFieldDepSave.getText()));
                JOptionPane.showMessageDialog(null, "You new balance " +uniChar+answer);
            }
        });
    }

    JFrame FrameWithdrawSave = new JFrame("window");
    JButton WithdrawSave = new JButton("Withdraw");
    //    JLabel Welcome = new JLabel("");
    JLabel AmountWithSave = new JLabel(" Enter Withdrawal Amount:");
    JTextField AmountFieldWithSave = new JTextField();

    public void withdrawSavingsUI() {
        FrameWithdrawSave.setSize(450, 500);
        FrameWithdrawSave.setLayout(new GridLayout(3, 1));
        FrameWithdrawSave.setVisible(true);
        FrameWithdrawSave.setLocationRelativeTo(null);
        FrameWithdrawSave.setTitle("Withdrawal");

        FrameWithdrawSave.add(AmountWithSave);
        FrameWithdrawSave.add(AmountFieldWithSave);
        FrameWithdrawSave.add(WithdrawSave);

        WithdrawSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BankAtm assObj = new BankAtm();
                float WithdrawSave = (Float.parseFloat(AmountFieldWithSave.getText()));
                float solution = assObj.withdrawalBalance(Float.parseFloat(AmountFieldWithSave.getText()));
                if (WithdrawSave > 20000) {
                    JOptionPane.showMessageDialog(null, "Withdrawal limit is " + uniChar + "20000");
                } else {
                    JOptionPane.showMessageDialog(null, "Your new balance is " + uniChar + solution);
                }
            }
        });
    }
    JFrame FrameCurrent = new JFrame("window");
    JLabel BalanceCurrent = new JLabel("Balance: "+uniChar+"100000");
    JButton depositCurrent = new JButton("Deposit");
    JButton withdrawCurrent = new JButton("Withdraw");

    public void currentUI() {
        FrameCurrent.setSize(450, 500);
        FrameCurrent.setLayout(new GridLayout(3, 1));
        FrameCurrent.setVisible(true);
        FrameCurrent.setLocationRelativeTo(null);
        FrameCurrent.setTitle("Account: Current");

        FrameCurrent.add(BalanceCurrent);
        FrameCurrent.add(depositCurrent);
        FrameCurrent.add(withdrawCurrent);

        depositCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositCurrentUI();
            }
        });
        withdrawCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawCurrentUI();
            }
        });
    }
}



