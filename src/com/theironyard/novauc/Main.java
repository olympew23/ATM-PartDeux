package com.theironyard.novauc;

import java.util.*;
import java.text.NumberFormat;
import java.math.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

//        Set set = account.entrySet();
//        Iterator i = set.iterator();
//        while (i.hasNext()) {
//            Map.Entry me = (Map.Entry) i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
         ArrayList options = new ArrayList();

         options.add("Checking? ");

         options.add("Savings? ");

        System.out.println("Good Morning!");

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(" Welcome," + name);

        HashMap<String, Double> account = new HashMap<>();
        account.put("Mary", new Double(300.59) );
        account.put("Johnny", new Double(1500.36));
        account.put("Walter", new Double(2252.39));

        System.out.println("Check if Name is in Hashmap: " + account.containsKey("Mary" +"Johnny" +"Walter" ));
        if (Boolean.valueOf("false"));{
        System.out.println("Would like to create an account? " + options.get(0) + options.get(1)  );
            String create = scanner.nextLine();
            if (create.equalsIgnoreCase("Checking" )){
                options.add(options);
                System.out.println("Thank you for choosing to open an account!");
                System.out.println("1. Check Balance/ 2.Withdraw Funds/ 3.Cancel");
                String prompt = scanner.nextLine();
                while(prompt.startsWith("/")){
                    switch (prompt){
                        case "/inv":
                            {

                            }

                    }
                }
            }







        {

            }

         {

        }



        }








        }






    }

////        double balance = ((Double)account.get("Mary")).doubleValue();
//      account.put("Mary", new Double(balance + 1000));
//      System.out.println("Mary's new balance: " + account.get("Mary"));{




