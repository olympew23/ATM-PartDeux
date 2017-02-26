package com.theironyard.novauc;

import javax.naming.InsufficientResourcesException;
import java.util.*;
import java.text.NumberFormat;
import java.math.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        // write your code here

//
        ArrayList options = new ArrayList();

        System.out.println("Good Morning!");

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(" Welcome," + name);

        HashMap<String, Double> account = new HashMap<>();
        account.put("Mary", new Double(300.59));
        account.put("Johnny", new Double(1500.36));
        account.put("Walter", new Double(2252.39));
        account.put("Tony", new Double(398));

        if (account.containsKey(name)) {
            System.out.println("Welcome! " + account.get(name));

        } else if (!account.containsKey(name));
                System.out.println("Account does not exits!");
                System.out.println("Would you like to add an account?"+ "[yes/no]" );
                String add = scanner.nextLine();
                if (add.equalsIgnoreCase("yes")) {
                    String create = scanner.nextLine();
                    Double value = account.get(name);
                    account.put(name,value);
                    System.out.println("Your account has been created" + account.get(name));
                }

            while (true) {
                System.out.println("1.Check Balance:");
                System.out.println("2. Withdraw Funds: ");
                System.out.println("3.Cancel: ");
                System.out.println("4. Remove account:");
                String text = scanner.nextLine();

                if (text.equals("1")) {
                    System.out.println("Your balance is:" + account.get(name));
                    String option = scanner.nextLine();

                } else if (text.equals("2")) {
                    System.out.println("Please input amount to withdraw:");
                    String answer = scanner.nextLine();
                    if(answer.isEmpty()) {
                        throw new RuntimeException("Insufficient funds");
                    }
                    Double to = Double.valueOf(answer);
                    Double me = account.get(name) - to;
                    System.out.println("Please take your cash ");
                    account.put(name, me);
                    System.out.println("Your new balance" + account.get(name));


                } else if (text.equals("4")) {
                    System.out.println("Your account has been removed");
                    account.remove(name);
                    String been = scanner.nextLine();
                } else {
                    System.out.println("Thank you have a nice day! ");
                    break;


                }
                while (text.equalsIgnoreCase("3")) {
                    System.out.println("What is your name?");


                }


            }

        }
    }

























////        double balance = ((Double)account.get("Mary")).doubleValue();
//      account.put("Mary", new Double(balance + 1000));
//      System.out.println("Mary's new balance: " + account.get("Mary"));{




