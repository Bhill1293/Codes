package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.util.Scanner;

public class Controller {
    FXMLLoader fxmlLoader = new FXMLLoader();//creating FXMLLoader object
//    fxmlLoader.setLocation(new URL("com.company/sample.fxml"));//accessing FXML file

    private float interest;
    private int principal;
    private byte period;




    @FXML

    public static String getMortgage(int principal,float interest,byte period) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Principal: ");
////        int principal = scanner.nextInt();
//        System.out.println("Annual Interest Rate: ");
//        float interest = scanner.nextFloat();
//        System.out.println("Period (Years): ");
//        byte period = scanner.nextByte();
        int numberOfPayments = period * 12;

        float monthlyInterest = interest / 100 / 12;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    public void operateButton (ActionEvent click) {
        Button button = (Button)click.getSource();
        String buttonText = button.getText();

        if(buttonText.equals("Get Mortgage Rate")) {
            getMortgage(principal,interest,period);
        }
    }
}
