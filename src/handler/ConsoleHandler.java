package handler;

import model.Bet;

import java.util.Scanner;

public class ConsoleHandler {
    public void handler() {
        try {
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите ставку: value, risk ");
                String val = in.nextLine();
                String[] s = val.split(" ");
                int value = Integer.parseInt(s[0]);
                double risk = Double.parseDouble(s[1]);
                Bet bet = new Bet();
                bet.setValue(value);
                bet.setRisk(risk);
                System.out.println();
            }
        } catch (Exception e ){
            System.out.println("Выполнен выход");

        }
    }
}
